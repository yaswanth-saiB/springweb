package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.velocity.springweb.model.Reservation;

@Controller
public class ReservationController {
	
	@RequestMapping("/bookingForm")
    public String bookingForm(Model theModel) {
		
        Reservation res= new Reservation();
        theModel.addAttribute("reservation", res);
        return "reservationPage"; //it has reservation obj/attribute
        
    }

   

}
