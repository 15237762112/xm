package com.zhiyou.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.AdminMapper;
import com.zhiyou.model.Admin;
import com.zhiyou.model.Speaker;
import com.zhiyou.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper mapper;

	public Integer login(String accounts, String password,HttpServletRequest req) {
		
		Admin admin = mapper.login(accounts);
		if (admin != null) {
			
			if (admin.getPassword().equals(password)) {
				req.getSession().setAttribute("MaxAdmin", admin);
				return 1;
			}
			
			return 2;
		}
		
		
		
		return 3;
	}

	public List<Speaker> videoShow() {
		
		return mapper.videShow();
	}

	public Speaker SpeakerSelectById(Integer id) {
		
		return mapper.SpeakerSelectById(id);
	}
	
}
