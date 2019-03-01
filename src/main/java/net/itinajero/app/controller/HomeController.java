package net.itinajero.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/localidad")
public class HomeController {

	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createAction(){
		return "localidad";
	}
	
}
