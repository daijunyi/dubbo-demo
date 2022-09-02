package com.daijunyi.dubbo.provider.service.impl;

import com.daijunyi.dubbo.inteface.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author djy
 * @createTime 2022/9/2 09:27
 * @description
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHelloString() {
        return "我是provider 2为你提供的服务";
    }
}
