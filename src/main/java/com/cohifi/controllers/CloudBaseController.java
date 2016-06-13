package com.cohifi.controllers;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cohifi.dao.UserDAO;
import com.cohifi.domain.User;

@Controller
public class CloudBaseController {
	Random rand = new Random();

	@Autowired
	UserDAO userDAOService;

	/**
	 * Load the index page jsp
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, @RequestBody MultiValueMap<String, String> formData) {
		ModelAndView modelView;
		List<String> username = formData.get("email");
		List<String> password = formData.get("password");
		System.out.println(username.get(0));
		System.out.println(password.get(0));
		User user = userDAOService.findUserByName(username.get(0));
		if (user != null) {
			if (user.getPassword().equals(password.get(0))) {
				modelView = new ModelAndView("index");
				return modelView;
			}
		}
		modelView = new ModelAndView("error");
		return modelView;

	}

}
