package com.deerlili.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // Eureka客户端
@EnableFeignClients    // 微服务的消费者
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
