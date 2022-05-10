package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.velocity.springweb.model.Reservation;

@Controller
public class SubmitController {
	 @RequestMapping("/submitForm")
	    public String submitForm(@ModelAttribute("reservation") Reservation res)
	    {
	        return "confirmationForm";
	    }

}
