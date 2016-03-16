package com.brano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.brano.task.Contact;


/*
 * @author: Branislav Smik
 * created 16.3.2016
 */

@Controller
public class ContactController {
		
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact() {
		return new ModelAndView("add_contact", "command", new Contact());
	}
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("EnterTask")Contact contact, ModelMap model) {
		model.addAttribute("name", contact.getName());
		model.addAttribute("surname", contact.getSurname());
		
		return "see_contact";
	}

}
