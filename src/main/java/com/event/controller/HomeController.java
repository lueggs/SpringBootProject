package com.event.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.event.model.Event;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
//	@GetMapping("/")
//	public String home() {
//		return "event";
//	}

	@GetMapping("/eventForm")
	public String eventForm(Model m) {
		m.addAttribute("event", new Event());
		return "addEvent";
	}

	@PostMapping("/addEvent")
	public String addEvent(@Valid Event event, Errors errors) {
		if(errors.hasErrors()) {
 //			System.out.println("---"+errors.getFieldErrors());
			return "addEvent";
		}
		
		return "redirect:/";
	}
}
