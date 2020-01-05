package com.mydes.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	public static final Logger logger = LoggerFactory.getLogger(AppController.class);

	@RequestMapping("/")
	String home(ModelMap modal) {
		logger.info("Fetching User with home");
		modal.addAttribute("title","CRUD Example");
		return "index";
	}

	@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		logger.info("Fetching User with partialHandler");
		return page;
	}

}
