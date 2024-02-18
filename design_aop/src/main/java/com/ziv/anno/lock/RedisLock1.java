package com.ziv.anno.lock;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * 简单的 SETNX + EXPIRE
 *
 */

@Slf4j
@Component
public class RedisLock1 {



    @Autowired
    private Jedis jedis;

    /**
     * setnx+ expire
     * 先用setnx来抢锁，如果抢到之后，再用expire给锁设置一个过期时间，防止锁忘记了释放
     * setnx和expire两个命令分开了，「不是原子操作」。如果执行完setnx加锁，正要执行expire设置过期时间时，进程crash或者要重启维护了
     * 那么这个锁就永远存在
     * @param key
     */
    public void lockRedis1(String key) {
        // 上锁了
        if (jedis.setnx(key, "lock") == 1) {
            try {
                Thread.sleep(5000);
                jedis.expire(key,10);
                log.info(" =======SETNX + EXPIRE 操作=======");
            } catch (Exception e) {

            } finally {
                jedis.del(key);
            }

        }
    }

    /**
     * 发生异常锁得不到释放的场景，可以把过期时间放到setnx的value值里面。如果加锁失败，再拿出value值校验一下即可
     * 但是
     * 过期时间是客户端自己生成的（System.currentTimeMillis()是当前系统的时间），必须要求分布式环境下，每个客户端的时间必须同步。
     * 如果锁过期的时候，并发多个客户端同时请求过来，都执行jedis.getSet()，最终只能有一个客户端加锁成功，但是该客户端锁的过期时间，可能被别的客户端覆盖
     * 该锁没有保存持有者的唯一标识，可能被别的客户端释放/解锁。
     * @param key
     */
    public void lockRedis2(String key) {
        Long expireTime = 5000L;
        long expires = System.currentTimeMillis() + expireTime; //系统时间+设置的过期时间
        String expiresStr = String.valueOf(expires);

        if (jedis.setnx(key, expiresStr) == 1) {
            try {
                Thread.sleep(5000);
                log.info(" =======SETNX + VALUE 操作=======");
            } catch (Exception e) {

            }finally {
                //jedis.del(key);
            }
        } else {
           String expiretime =  jedis.get(key);
            // 如果获取到的过期时间，小于系统当前时间，表示已经过期
            if (expiretime != null && Long.parseLong(expiretime) < System.currentTimeMillis()) {
                // 锁已过期，获取上一个锁的过期时间，并设置现在锁的过期时间（redis的getSet命令的）
                String oldValueStr = jedis.getSet(key, expiresStr);

                if (oldValueStr != null && oldValueStr.equals(expiretime)) {
                    // 考虑多线程并发的情况，只有一个线程的设置值和当前值相同，它才可以加锁
                    log.info(" =======SETNX + VALUE 操作=======");
                    jedis.del(key);
                }
            } else {
                log.info(" =======SETNX + VALUE 操作=======");
                //jedis.del(key);
            }
        }
    }

    /**
     * SET的扩展命令（SET EX PX NX）
     * 既然锁可能被别的线程误删，那我们给value值设置一个标记当前线程唯一的随机数，在删除的时候，校验一下
     * @param key
     * @param requestId
     */
    public void lockRedis3(String key,String requestId) {
        String set = jedis.set(key, requestId, "NX", "EX", 20);
        if ("ok".equalsIgnoreCase(set)) {
            try {
                log.info(" =======SETNX + EXPIRE 操作=======");
            } catch (Exception e) {

            } finally {
                // 此操作不是原子性的  可通过lua脚本实现
                if (requestId.equals(jedis.get(key))){
                    //jedis.del(key);
                }
            }
        }
    }





}
