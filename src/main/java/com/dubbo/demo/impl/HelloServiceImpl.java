package com.dubbo.demo.impl;

import com.dubbo.demo.HelloService;
import com.dubbo.demo.TransitionNode;

import java.util.HashMap;
import java.util.Map;


public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("getContent " + name);
        return "Hello, " + name + "!";
    }

    @Override
    public Map<String, String> mapEcho() {
        Map<String,String> ret= new HashMap<String,String>();
        ret.put("key1","Hello");
        ret.put("key2","World");
        return ret;
    }

    @Override
    public TransitionNode objectEcho() {
        return new TransitionNode();
    }
}
