package com.yanfei1819.eurekaconsunmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsunmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsunmerApplication.class, args);
	}


	// 将RestTemplate纳入Spring容器进行管理
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}

