package com.lsh.dubbop1;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启dubbo注解
@EnableDubbo
@SpringBootApplication
public class Dubbop1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dubbop1Application.class, args);
	}

}
