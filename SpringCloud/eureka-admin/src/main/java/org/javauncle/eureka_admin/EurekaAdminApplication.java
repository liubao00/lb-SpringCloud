package org.javauncle.eureka_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //注册到注册中心上去
@SpringBootApplication
public class EurekaAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAdminApplication.class, args);
	}

}
