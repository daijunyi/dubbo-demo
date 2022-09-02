package com.daijunyi.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import static org.apache.dubbo.common.constants.CommonConstants.DUBBO_PREFERRED_NETWORK_INTERFACE;

/**
 * @author djy
 * @createTime 2022/9/1 20:58
 * @description
 */
@Service
@EnableDubbo
@SpringBootApplication
public class DubboConsumerAppliaction {

    public static void main(String[] args) {
        System.setProperty(DUBBO_PREFERRED_NETWORK_INTERFACE,"en0");
        SpringApplication.run(DubboConsumerAppliaction.class,args);
    }
}
