package com.xk.springboot.nats.subscribe;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;

/**
 * @description: spring-boot-nats
 * @author: hengxiaokang
 * @time 2020/10/30 13:35
 */
@Slf4j
@Component
public class AsyncSubscribe implements ApplicationRunner {

    @Autowired
    private Connection connection;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
       /* Dispatcher d = connection.createDispatcher((msg) -> {
            String str = new String(msg.getData(), StandardCharsets.UTF_8);
            log.info("AsyncSubscribe msg:{}", str);
        });
        // Subscribe
        d.subscribe("hello");*/
    }
}
