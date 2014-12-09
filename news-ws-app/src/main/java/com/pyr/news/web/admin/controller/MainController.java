package com.pyr.news.web.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@RequestMapping(value="/main/idx")
	public ModelAndView indexResponse(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		Map model = new HashMap();//mv.getModelMap();
		model.put("header", "/main/header.html");
		model.put("common", "/main/center.html");
		model.put("footer", "/main/footer.html");
		System.out.println("main idx..");
		mv.setViewName("index");
		return mv.addAllObjects(model);
	}
	
	@RequestMapping(value="/main/header")
	public String headerPartResponse(HttpServletRequest request, HttpServletResponse response){
		System.out.println("main header..");
		return "/header/header";
	}
	@RequestMapping(value="/main/footer")
	public String footerPartResponse(HttpServletRequest request, HttpServletResponse response){
		System.out.println("main footer..");
		return "/footer/footer";
	}
	@RequestMapping(value="/main/center")
	public ModelAndView middlePartResponse(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		Map model = new HashMap();// mv.getModelMap();
		System.out.println("main center..");
		model.put("left", "/main/left.html");
		model.put("center", "/main/common.html");
		model.put("right", "/main/right.html");
		mv.setViewName("center/common");
		return mv.addAllObjects(model);
	}

}
