package net.itinajero.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.app.model.MntPaciente;
import net.itinajero.app.model.MyUser;
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
			RedirectAttributes attributes,@RequestParam(value="btn_save") String accion) {
		System.out.println("accion" + accion);		
		servicePx.insertar(mntPaceinte);
		attributes.addFlashAttribute("msg", "Los datos del paciente fueron guardados!");
		if(accion.equals("cita")) {
			return "paciente/cita";
		}else if(accion.equals("consulta")) {
			return "paciente/consulta";
		}

		return "redirect:/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	@GetMapping(value = "/list")
	public String mostrarUsuarios(Model model) {
		List<MntPaciente> listaPaciente = servicePx.pacientes();
		model.addAttribute("pacientes", listaPaciente);
		return "paciente/listPaciente";
	}
	@GetMapping(value = "/edit/{id}")
	public String editar(@PathVariable("id") int idUsuario, Model model) {
		MntPaciente mntPaciente = servicePx.pacienteById(idUsuario);
		model.addAttribute("mntPaciente", mntPaciente);
		System.out.print("aquim" + model);
		return "paciente/registroPaciente";
	}
	@GetMapping(value = "/delete/{id}")
	public String eliminar(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {
		MntPaciente mntPaciente = servicePx.pacienteById(idUsuario);		
		servicePx.eliminar(idUsuario);		
		attributes.addFlashAttribute("msg", "El paciente fue eliminado!.");
		return "redirect:/paciente/list";
	}
	@GetMapping(value = "/cita")
	public String citaPaciente() {		
		return "paciente/cita";
	}
	
	
	


}
