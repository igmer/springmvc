package net.itinajero.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.app.model.CtlTipoEmpleado;
import net.itinajero.app.repository.CtlTipoEmpleadoRepository;
@Service
public class CtlTipoEmpleadoServiceJPA implements ICtlTipoEmpleado {
	@Autowired
	private CtlTipoEmpleadoRepository repoTipo;

	@Override
	public List<CtlTipoEmpleado> tipoEmpleado() {
		
		return repoTipo.findAll();
	}

}
