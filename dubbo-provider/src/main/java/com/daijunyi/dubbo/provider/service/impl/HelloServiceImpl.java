package com.daijunyi.dubbo.provider.service.impl;

import com.daijunyi.dubbo.inteface.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author djy
 * @createTime 2022/9/1 22:24
 * @description
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHelloString() {
        return "我是hello world";
    }
}
