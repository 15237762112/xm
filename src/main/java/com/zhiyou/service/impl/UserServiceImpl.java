package com.zhiyou.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;

	public void add(User user) {
		// TODO Auto-generated method stub
		mapper.add(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.update(user);
	}

	public User selectByAccounts(String account, HttpServletRequest req, String password) {
		// TODO Auto-generated method stub
		User user2 = null;
		try {
			user2 = mapper.selectByAccounts(account);
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (user2 == null) {
			req.setAttribute("msg", "账户不存在");
			return null;
		} else if (user2.getPassword().equals(password)) {

			return user2;

		} else {
			req.setAttribute("msg", "密码不正确");
			return null;
		}

	}

	public boolean selectByAccounts(String account) {
		// TODO Auto-generated method stub
		User user2 = null;
		try {
			user2 = mapper.selectByAccounts(account);
		} catch (Exception e) {
			// TODO: handle exception

		}

		if (user2 != null) {
			return false;
		} else {
			return true;
		}

	}

}
