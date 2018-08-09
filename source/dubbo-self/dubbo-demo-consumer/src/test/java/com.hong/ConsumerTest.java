package com.hong;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hong.dubbo.demo.HelloWorldService;
import com.hong.dubbo.demo.consumer.ConsumerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ConsumerApplication.class)
public class ConsumerTest {

    @Reference(retries = 2, cluster = "failsafe")
    public HelloWorldService helloWorldService;

    @Test
    public void testDobboService() {
        String aa = helloWorldService.sayHello("aa");
        Assert.hasText("Hello");
    }
}
