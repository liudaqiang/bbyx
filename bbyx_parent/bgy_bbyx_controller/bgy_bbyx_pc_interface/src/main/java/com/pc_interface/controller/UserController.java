package com.pc_interface.controller;

import java.util.List;

import org.bgy_bbyx_common.exception.MyException;
import org.bgy_bbyx_model.User;
import org.bgy_bbyx_service.service_interface.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "UserController", description = "测试controller")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 引入日志，注意都是"org.slf4j"包下
	 */
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/user")
	@ApiOperation(value = "测试方法", notes = "模拟用户访问",httpMethod ="GET")
	@ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
	public List<User> user(User user) {
		List<User> users = userService.findPage(user);
		logger.info("访问selectUser"+users.toString());
		throw new MyException("101", "Sam 错误");
		//return users;
	}
}
