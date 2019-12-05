package com.zhiyou.service;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zhiyou.model.Speaker;


public interface AdminService {

	Integer login(String accounts, String password,HttpServletRequest req);

	List<Speaker> videoShow();

	Speaker SpeakerSelectById(Integer id);

}
