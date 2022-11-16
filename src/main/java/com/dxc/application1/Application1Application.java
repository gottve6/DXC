package com.dxc.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.dxc"})
@EntityScan(basePackages= {"com.dxc"})
public class Application1Application {

	public static void main(String[] args) {
		SpringApplication.run(Application1Application.class, args);
	}

}
