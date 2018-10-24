package org.bgy_bbyx_service.service_impl;

import java.util.List;

import org.bgy_bbyx_dao.UserDao;
import org.bgy_bbyx_model.User;
import org.bgy_bbyx_model.page.PageBean;
import org.bgy_bbyx_service.service_interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findPage(User user) {
		PageHelper.startPage(user.getTotalPage(), user.getPageSize());
		List<User> allItems = userDao.findPage(user); // 全部商品
		int countNums = userDao.findPageCount(user); // 总记录数
		PageBean<User> pageData = new PageBean<>(user.getTotalPage(), user.getPageSize(), countNums);
		pageData.setItems(allItems);
		return pageData.getItems();
	}

	@Override
	public Integer findPageCount(User user) {
		// TODO Auto-generated method stub
		return  userDao.findPageCount(user);
	}

	@Override
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userDao.findAll(user);
	}

}
