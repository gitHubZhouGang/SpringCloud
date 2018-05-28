package com.servicefeign.controller;

import com.servicefeign.service.IHellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 9:36 2018/5/28
 * @Modified By:
 */
@RestController
public class HiController {

    @Autowired
    IHellowService hellowService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name")String name){
        return hellowService.sayHiFromClientOne(name);
    }
}
