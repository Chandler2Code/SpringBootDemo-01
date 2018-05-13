package com.czyfwpla.demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.czyfwpla.demo01.mapper")
public class Demo01Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo01Application.class, args);
	}
}
