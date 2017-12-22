package com.iparhan.blog.web;

import com.iparhan.blog.model.User;
import com.iparhan.blog.service.SecurityService;
import com.iparhan.blog.service.UserService;
import com.iparhan.blog.validator.UserValidator;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/iparhan")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    

    /**
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView,HttpServletResponse httpServletResponse) {
		httpServletResponse.setContentType("text/html;charset=UTF-8");
		System.out.println("Helllo");
		 return new ModelAndView("index");
	}
	
	/**
	 * index.html
	 * @param modelAndView
	 * @param httpServletResponse
	 * @return
	 */
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(ModelAndView modelAndView,HttpServletResponse httpServletResponse){
		httpServletResponse.setContentType("text/html;charset=UTF-8");
		System.out.println("AdminLogin==============ddsd");
		return new ModelAndView("admin/index");

	}
	
	@RequestMapping("/adminLOgin")
	public String adminLOgin() {
		System.out.println("index.html");
		return ("admin/index");
	}
	
	/**
	 * main.html
	 * @param httpServletResponse
	 * @return
	 */
	@RequestMapping(value = "/adminIndex", produces = MediaType.TEXT_HTML_VALUE + ";charset=UTF-8")
	public String adminIndex(HttpServletResponse httpServletResponse) {
		httpServletResponse.setContentType("text/html;charset=utf-8");
		System.out.println("Hello");
		return "admin/main";
	}
}
