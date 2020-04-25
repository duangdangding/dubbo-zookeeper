package com.lsh.dubboc1;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启dubbo注解
@EnableDubbo
@SpringBootApplication
public class Dubboc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dubboc1Application.class, args);
	}

}
