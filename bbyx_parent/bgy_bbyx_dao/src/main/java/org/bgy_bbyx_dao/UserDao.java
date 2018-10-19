package org.bgy_bbyx_dao;

import java.util.List;

import org.bgy_bbyx_model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	public List<User> getAllUser();
}
