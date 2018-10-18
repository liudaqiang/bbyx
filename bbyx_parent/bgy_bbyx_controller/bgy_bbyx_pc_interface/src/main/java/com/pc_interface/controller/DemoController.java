package com.pc_interface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/demo")
	public String demo() {
		return demoService.demo();
	}
}
