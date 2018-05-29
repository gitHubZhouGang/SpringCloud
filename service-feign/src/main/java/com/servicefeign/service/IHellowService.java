package com.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 9:33 2018/5/28
 * @Modified By:
 */
@FeignClient(value="SERVICE-EUREKA",fallback = HellowService.class)
public interface IHellowService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}
