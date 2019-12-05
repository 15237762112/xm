package com.zhiyou.service;

import javax.servlet.http.HttpServletRequest;

import com.zhiyou.model.User;

public interface UserService {
	void add(User user);

	void update(User user);

	User selectByAccounts(String account, HttpServletRequest req, String password);

	boolean selectByAccounts(String account);
}
