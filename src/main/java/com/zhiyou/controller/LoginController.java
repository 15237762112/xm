package com.zhiyou.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService service;

	@ResponseBody
	@RequestMapping(value = "exit")
	public String exit(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().invalidate();
		return "success";
	}

	@ResponseBody
	@RequestMapping(value = "generalUserLogin")
	public String generalUserLogin(String accounts, String password, HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		req.setCharacterEncoding("UTF-8");
		String aString = null;
		User user = service.selectByAccounts(accounts, req, password);
		if (user == null) {
			aString = "false";
		} else {
			aString = "success";
		}
		req.getSession().setAttribute("list", user);
		return aString;
	}

	@ResponseBody
	@RequestMapping("generalUserRegister")
	public String generalUserRegister(User user, HttpServletRequest req, HttpServletResponse resp) {

		return "success";
	}

	@ResponseBody
	@RequestMapping("validateEmail")
	public String validateEmail(String email, HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(email);
		String aString = "";
		boolean b = service.selectByAccounts(email);
		if (b) {
			aString = "success";
		} else {
			aString = "false";
		}
		System.out.println(aString);
		return aString;

	}

	@ResponseBody
	@RequestMapping("insertUser")
	public String insertUser(User user, HttpServletRequest req, HttpServletResponse resp) {
		user.setImgurl("z/avatar_lg.png");
		service.add(user);
		return "success";
	}

	@RequestMapping("adminLogin")
	public String adminLogin() {

		return "backstage/adminLogin";
	}
}
