package com.ziv.anno.queue.consumer;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBlockingDeque;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * redis 的消费者
 */
@Component
@Slf4j
public class RedisConsumer implements CommandLineRunner {

    @Autowired
    private RedissonClient redissonClient;

    private static final String REDIS_QUEUE = "listQueue";

    /**
     * 消息消费：阻塞
     */
    public void msgConsume() {
        RBlockingDeque<String> blockDeque = redissonClient.getBlockingDeque(REDIS_QUEUE);

        boolean isCheck = true;
        while (isCheck) {
            try {
                String msg = blockDeque.takeLast();  // 从队列中取出消息
                log.info("消费消息----" + msg);
            } catch (Exception e) {
                log.info("消费者出错");
            }
        }
    }

    @Override
    public void run(String... args) throws Exception {
        msgConsume();
    }
}
