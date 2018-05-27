package com.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService implements IHelloService {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-EUREKA/hi?name="+name,String.class);
    }
}
