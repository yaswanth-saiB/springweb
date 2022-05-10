package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
    public String showLoginForm()
    {
        return "login";  //returns view
    }

}
