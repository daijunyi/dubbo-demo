package com.daijunyi.dubbo.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

import static org.apache.dubbo.common.constants.CommonConstants.DUBBO_PREFERRED_NETWORK_INTERFACE;

@SpringBootApplication
@EnableDubbo
@Slf4j
public class DubboProviderApplication {

	public static void main(String[] args) throws UnknownHostException {
		System.setProperty(DUBBO_PREFERRED_NETWORK_INTERFACE,"en0");
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}
