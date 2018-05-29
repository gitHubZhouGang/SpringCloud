package com.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

public interface IHelloService {

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name);
}
