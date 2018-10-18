package com.pc_interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pc_interface,com.demo")
public class Appication {
	public static void main(String[] args) {
		SpringApplication.run(Appication.class, args);
	}
}
