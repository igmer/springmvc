package net.itinajero.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.itinajero.app.model.MyUser;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String createAction(){
		return "home";
	}
	
	@RequestMapping(value="/registrando", method=RequestMethod.POST)
	public String registrandoAction(){
		return "register";
	}
	
	
}
