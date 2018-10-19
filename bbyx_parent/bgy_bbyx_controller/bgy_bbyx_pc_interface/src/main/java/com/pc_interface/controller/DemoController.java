package com.pc_interface.controller;

import java.util.List;

import org.bgy_bbyx_model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/demo")
	public List<User> demo(User user) {
		return demoService.demo(user);
	}
}
