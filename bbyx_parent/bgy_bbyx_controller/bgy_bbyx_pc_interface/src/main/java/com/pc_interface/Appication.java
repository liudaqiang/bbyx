package com.pc_interface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.bgy_bbyx_dao")
@ComponentScan("com.pc_interface,com.demo,org.bgy_bbyx_dao")
public class Appication {
	public static void main(String[] args) {
		SpringApplication.run(Appication.class, args);
	}
}
