package com.yanfei1819.eurekaconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
	}

	// 将RestTemplate纳入Spring容器进行管理
	// @LoadBalanced的作用是在请求客户有负载均衡的能力
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

