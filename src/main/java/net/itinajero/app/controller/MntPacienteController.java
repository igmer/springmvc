package net.itinajero.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.app.model.MntPaciente;
import net.itinajero.app.service.IMntPaciente;

@Controller
@RequestMapping(value = "/paciente")
public class MntPacienteController {
	@Autowired
	private IMntPaciente servicePx;;
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerAction(@ModelAttribute MntPaciente mntPaciente) {
		return "paciente/registroPaciente";
	}
	
	@PostMapping(value = "/save")
	public String guardar(MntPaciente mntPaceinte, Model model, HttpServletRequest request,
			RedirectAttributes attributes) {
		System.out.println("llego controlador" + mntPaceinte);

		
		servicePx.insertar(mntPaceinte);
		attributes.addFlashAttribute("msg", "Los datos del paciente fueron guardados!");

		return "redirect:register";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}


}
