package com.pc_interface.controller;

import java.util.List;

import org.bgy_bbyx_model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DemoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "DemoController", description = "测试controller")
public class DemoController {
	@Autowired
	private DemoService demoService;
	/**
	 * 引入日志，注意都是"org.slf4j"包下
	 */
	private final static Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/demo")
	@ApiOperation(value = "测试方法", notes = "模拟用户访问",httpMethod ="GET")
	@ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
	public List<User> demo(User user) {
		List<User> demos = demoService.demo(user);
		logger.info("访问selectUser"+demos.toString());
		return demos;
	}
}
