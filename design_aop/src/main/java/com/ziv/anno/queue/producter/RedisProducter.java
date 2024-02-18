package com.ziv.anno.queue.producter;

import org.redisson.api.RBlockingDeque;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * redis的生产者
 */
@Service
public class RedisProducter {

    @Autowired
    private RedissonClient redissonClient;

    private static final String REDIS_QUEUE = "listQueue";

    /**
     * 消息生产
     *
     * @param msg
     */
    public void msgProduce(String msg) {
        RBlockingDeque<String> blockDeque = redissonClient.getBlockingDeque(REDIS_QUEUE);
        try {
            blockDeque.putFirst(msg); // 消息写入队列头部
        } catch (InterruptedException e) {
            System.out.println("出错了");
        }
    }
}
