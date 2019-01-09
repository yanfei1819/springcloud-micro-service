package com.yanfei1819.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注意事项：
 * 1.application.properties文件要改为bootstrap.properties文件，后者比前者优先级高，先加载；
 * 2.
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConfigClientApplication {

	/**
	 * 待续：启动报错
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigClientApplication.class, args);
	}

}

