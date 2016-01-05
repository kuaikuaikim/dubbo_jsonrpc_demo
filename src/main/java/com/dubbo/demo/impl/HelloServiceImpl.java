package com.dubbo.demo.impl;

import com.dubbo.demo.HelloService;


public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("getContent " + name);
        return "Hello, " + name + "!";
    }
}
