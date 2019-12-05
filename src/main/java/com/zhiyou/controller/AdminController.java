package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou.model.Speaker;
import com.zhiyou.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	 AdminService service;
	@RequestMapping(value = "login")
	public ModelAndView  login(String accounts,String password,HttpServletRequest req,HttpServletResponse resp){
		Integer num = service.login(accounts,password, req);
		ModelAndView model = new ModelAndView();
		if (num == 1) {
			model.setViewName("forward:show");
		}else if (num == 2) {
			model.addObject("msg", "密码错误");
			model.setViewName("adminLogin");
		}else {
			model.addObject("msg", "账号错误");
			model.setViewName("adminLogin");
		}
		return model;
	}
	@RequestMapping(value = "show")
	public ModelAndView  show(HttpServletRequest req,HttpServletResponse resp){
		// List<Speaker> list = service.videoShow();
		ModelAndView model = new ModelAndView();
		model.addObject("list",service.videoShow());
		model.setViewName("speaker/speakerShow");
		return model;
	}
	@RequestMapping(value = "Uspeaker")
	public ModelAndView  Uspeaker(Integer id,HttpServletRequest req,HttpServletResponse resp){
	  
	 
	 ModelAndView model = new ModelAndView();
	 model.addObject("speaker",service.SpeakerSelectById(id));
	 model.setViewName("speaker/speakerUpdate");
	 return model;
	}
}