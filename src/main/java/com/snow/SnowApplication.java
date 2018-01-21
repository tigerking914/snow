package com.snow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snow.dam.core.mapper")
public class SnowApplication {

	public static void main(String[] args) {

		SpringApplication.run(SnowApplication.class, args);
	}
}
