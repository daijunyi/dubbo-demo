package com.daijunyi.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.apache.dubbo.common.constants.CommonConstants.DUBBO_PREFERRED_NETWORK_INTERFACE;

/**
 * @author djy
 * @createTime 2022/9/2 09:26
 * @description
 */
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        System.setProperty(DUBBO_PREFERRED_NETWORK_INTERFACE,"en0");
        SpringApplication.run(ProviderApplication.class,args);
    }
}
