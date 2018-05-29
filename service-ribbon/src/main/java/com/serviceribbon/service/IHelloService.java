package com.serviceribbon.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;

public interface IHelloService {

    public String hiService(String name);
}
