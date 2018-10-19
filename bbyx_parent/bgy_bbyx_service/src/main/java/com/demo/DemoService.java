package com.demo;

import java.util.List;

import org.bgy_bbyx_dao.UserDao;
import org.bgy_bbyx_model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Autowired
	private UserDao userDao;
	
	public List<User> demo(User user) {
		return userDao.getAllUser();
	}
}
