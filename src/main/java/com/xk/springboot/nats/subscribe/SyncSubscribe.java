package com.xk.springboot.nats.subscribe;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import io.nats.client.Message;
import io.nats.client.Subscription;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.time.Duration;

/**
 * @description: spring-boot-nats
 * @author: hengxiaokang
 * @time 2020/10/30 13:35
 */
@Slf4j
@Component
public class SyncSubscribe implements ApplicationRunner {

    @Autowired
    private Connection connection;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        // Subscribe
        Subscription sub = connection.subscribe("hello");

// Read a message
        Message msg = sub.nextMessage(Duration.ZERO);

        String str = new String(msg.getData(), StandardCharsets.UTF_8);
        log.info("SyncSubscribe msg:{}", str);
    }
}
