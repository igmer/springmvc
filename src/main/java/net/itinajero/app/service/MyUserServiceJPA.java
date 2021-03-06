package net.itinajero.app.service;

import java.awt.print.Pageable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import net.itinajero.app.model.MyUser;
import net.itinajero.app.repository.MyUserRepository;
@Service
public class MyUserServiceJPA implements IUsuarioService{
	@Autowired
	private MyUserRepository userRepo;

	@Override
	public void insertar(MyUser user) {
		userRepo.save(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MyUser> buscarTodas() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public MyUser buscarPorId(int idUsuario) {
		Optional<MyUser> optional = userRepo.findById(idUsuario);
		if (optional.isPresent())
			return optional.get();
		return null;
	}	

	@Override
	public void eliminar(int idPelicula) {
		userRepo.deleteById(idPelicula);
		
	}	

	
}
