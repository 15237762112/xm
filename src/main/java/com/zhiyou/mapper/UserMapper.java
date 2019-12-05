package com.zhiyou.mapper;

import com.zhiyou.model.User;

public interface UserMapper {

	void add(User user);

	void update(User user);

	User selectByAccounts(String account);

}
