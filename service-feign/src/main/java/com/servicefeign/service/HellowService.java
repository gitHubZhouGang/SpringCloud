package com.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 11:20 2018/5/29
 * @Modified By:
 */
@Component
public class HellowService implements IHellowService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry,"+name+" the server is disable ; Pls retry later!";
    }
}
