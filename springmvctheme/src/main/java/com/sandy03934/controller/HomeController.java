package com.sandy03934.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView home(HttpServletResponse response) {
		return new ModelAndView("home");
	}

	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletResponse response) {
		return new ModelAndView("login");
	}
}
