package com.cohifi.controllers;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CloudBaseController {
	private static ApplicationContext context = null;
	Random rand = new Random();

	
	/**
	 * Load the index page jsp
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView newProductDataForm() {
		ModelAndView modelView;
		modelView = new ModelAndView("index");
		return modelView;
	}

}
