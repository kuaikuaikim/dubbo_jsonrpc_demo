package com.dubbo.demo;


import java.util.Map;

public interface HelloService {
    String hello(String name);
    Map<String,String> mapEcho();
    TransitionNode objectEcho();
}
