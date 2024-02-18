package com.ziv.anno.controller;

import com.ziv.anno.delay.DelayQueueService;
import com.ziv.anno.lock.RedisLock1;
import com.ziv.anno.queue.producter.RedisProducter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * aop测试控制类
 */
@RestController
@Slf4j
public class QueueTestController {


    @Autowired
    RedisProducter redisProducter;

    /**
     * 普通队列的
     */
    @GetMapping("/queue")
    public void queue () {
        log.info("===queue队列===");
        redisProducter.msgProduce("hello");
    }



    @Autowired
    DelayQueueService delayQueueService;

    /**
     * 延迟队列   1.回调  2.定时任务/指定时间的任务
     * @param message
     * @param time
     */
    @GetMapping(value = "/delay/{message}/{time}")
    public void delay (@PathVariable("message") String message, @PathVariable("time") Long time) {
        log.info("===delay队列===");
        delayQueueService.addToDelayQueue(message,time);
        //delayQueueService.pollAndProcessDelayedMessages();
    }


    /**
     * 分布式锁
     */
    @Autowired
    RedisLock1 redisLock1;

    @GetMapping(value = "/lock1/{key}")
    public void lock1 (@PathVariable("key") String key) {
        log.info("===分布式锁lock1===");
        redisLock1.lockRedis1(key);
    }

    @GetMapping(value = "/lock2/{key}")
    public void lock2 (@PathVariable("key") String key) {
        log.info("===分布式锁lock2===");
        redisLock1.lockRedis2(key);
    }

    @GetMapping(value = "/lock3/{key}/{requestId}")
    public void lock3 (@PathVariable("key") String key,@PathVariable("requestId")String requestId) {
        log.info("===分布式锁lock3===");
        redisLock1.lockRedis3(key,requestId);
    }

}
