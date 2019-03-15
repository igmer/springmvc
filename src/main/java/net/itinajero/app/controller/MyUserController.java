package net.itinajero.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.app.model.CtlEstablecimiento;
import net.itinajero.app.model.CtlTipoEmpleado;
import net.itinajero.app.model.MyUser;
import net.itinajero.app.service.ICtlEstablecimientoService;
import net.itinajero.app.service.ICtlTipoEmpleado;
import net.itinajero.app.service.IUsuarioService;

@Controller
@RequestMapping(value = "/user")
public class MyUserController {
	@Autowired
	private IUsuarioService serviceUsuario;
	@Autowired
	private ICtlEstablecimientoService serviceEst;
	@Autowired
	private ICtlTipoEmpleado serviceEmp;

	@PostMapping(value = "/save")
	public String guardar(MyUser usuario, BindingResult result, Model model, HttpServletRequest request,
			RedirectAttributes attributes) {
		System.out.println("llego controlador" + usuario);

		if (result.hasErrors()) {
			System.out.println("Existieron errores");
			return "register";
		}
		serviceUsuario.insertar(usuario);
		attributes.addFlashAttribute("msg", "Los datos del usuario fueron guardados!");

		return "redirect:list";
	}

	@GetMapping(value = "/list")
	public String mostrarUsuarios(Model model) {
		List<MyUser> listaUsuario = serviceUsuario.buscarTodas();
		model.addAttribute("usuarios", listaUsuario);
		System.out.println(listaUsuario);
		return "usuario/listUsuario";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerAction(@ModelAttribute MyUser myUser) {
		return "register";
	}

	@ModelAttribute("idEstablecimiento")
	public List<CtlEstablecimiento> getGeneros() {
		return serviceEst.buscarTodas();
	}

	@ModelAttribute("idTipoEmpleado")
	public List<CtlTipoEmpleado> getTipos() {
		return serviceEmp.tipoEmpleado();
	}

	/**
	 * Metodo para editar un usuario
	 * 
	 * @param id del usaurio
	 */
	@GetMapping(value = "/edit/{id}")
	public String editar(@PathVariable("id") int idUsuario, Model model) {
		MyUser myUser = serviceUsuario.buscarPorId(idUsuario);
		model.addAttribute("myUser", myUser);
		System.out.print("aquim" + model);
		return "register";
	}
	@GetMapping(value = "/delete/{id}")
	public String eliminar(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {
		MyUser user = serviceUsuario.buscarPorId(idUsuario);		
		serviceUsuario.eliminar(idUsuario);		
		attributes.addFlashAttribute("msg", "El usuario fue eliminado!.");
		return "redirect:/user/list";
	}

}
