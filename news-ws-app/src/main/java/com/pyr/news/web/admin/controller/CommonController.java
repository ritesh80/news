package com.pyr.news.web.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	@RequestMapping(value="/main/left")
	public String leftPartResponse(HttpServletRequest request, HttpServletResponse response){
		System.out.println("main left..");
		return  "center/left";
			
	}
	
	@RequestMapping(value="/main/common")
	public String commonPartResponse(HttpServletRequest request, HttpServletResponse response){
		return  "center/middle";
			
	}
	
	@RequestMapping(value="/main/right")
	public String rightPartResponse(HttpServletRequest request, HttpServletResponse response){
		return  "center/right";
			
	}

}
