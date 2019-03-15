package net.itinajero.app.pruebas;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.model.MyUser;
import net.itinajero.app.repository.MyUserRepository;



public class Prueba {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		MyUserRepository repo = context.getBean("myUserRepository",MyUserRepository.class);
		MyUser user = new MyUser();
		user.setNombre("igmer");
		user.setHabilitado(1);
		user.setPassword("12345");
		user.setEmail("igmer@mail.com");
		user.setIdEstablecimiento(1);
		user.setTelefono("77476504");
		user.setSexo("M");
		user.setSalto("misalto");
		user.setIdTipoEmpleado(1);		
		repo.save(user);
		context.close();
		

	}

}
