package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.home.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "listusers")
	public ModelAndView listUsers(){
		return new ModelAndView("listUsers", "listUsersData", "Users List Data Returned!!!");
	}
	
	@RequestMapping(value = "saveusers")
	public ModelAndView saveUsers(User user){
		return new ModelAndView("saveUsers", "saveUsersData", "Users List Data Saved!!!");
	}
	
	@RequestMapping(value = "deleteusers")
	public ModelAndView deleteUsers(User user){
		return new ModelAndView("deleteUsers", "deleteUsersData", "Users  Data deleted!!!");
	}
	
}
