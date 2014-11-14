package com.pyr.news.web.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/idx")
	public String usersResponse(HttpServletRequest request, HttpServletResponse response){
		return "index";
	}

	@RequestMapping(value="/user/get")
	public String getUserResponse(HttpServletRequest request, HttpServletResponse response){
		return "index";
	}
}
