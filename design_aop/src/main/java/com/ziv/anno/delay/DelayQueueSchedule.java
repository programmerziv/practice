package com.ziv.anno.delay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author zongzhang
 */
@Component
public class DelayQueueSchedule {


    @Autowired
    private DelayQueueService delayQueueService;


    // 每隔一段时间进行轮询并处理延迟消息
    @Scheduled(fixedRate = 1000 * 30)
    public void pollAndProcessDelayedMessages() {
        delayQueueService.pollAndProcessDelayedMessages();
    }
}