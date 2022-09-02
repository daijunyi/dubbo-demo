package com.daijunyi.dubbo.consumer.controller;

import com.daijunyi.dubbo.inteface.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djy
 * @createTime 2022/9/1 22:27
 * @description
 */
@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.getHelloString();
    }

}
