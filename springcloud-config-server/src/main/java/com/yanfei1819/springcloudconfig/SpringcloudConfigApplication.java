package com.yanfei1819.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注意：
 * 1.在git上创建配置文件的命名规范：服务名称.环境.properties
 *	例如：
 * 		test-config.dev.properties
 *
 * 	2.访问的地址：localhost:8098/test-config.dev.properties
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringcloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigApplication.class, args);
	}

}

