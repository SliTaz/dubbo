package com.hong.dubbo.demo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hong.dubbo.demo.HelloWorldService;

@Service(timeout = 5000)
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        return "Hello" + " " + name;
    }
}
