package com.former.youtestme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.former.youtestme.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String showIndexPage(Model model) {
		model.addAttribute("users", userService.getAll());
		return "index";
	}
}
