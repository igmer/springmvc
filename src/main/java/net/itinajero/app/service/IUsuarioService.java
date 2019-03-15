package net.itinajero.app.service;

import java.awt.print.Pageable;
import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import net.itinajero.app.model.MyUser;

public interface IUsuarioService {
	void insertar(MyUser user);	
	List<MyUser> buscarTodas();
	MyUser buscarPorId(int idUsuario);
	List<String> buscarEstablecimientos();
	
    List<MyUser> buscarActivas();	
	List<MyUser> buscarPorFecha(Date fecha);
	Page<MyUser> buscarTodasPageable(Pageable page);	
	void eliminar(int idPelicula);
	

}
