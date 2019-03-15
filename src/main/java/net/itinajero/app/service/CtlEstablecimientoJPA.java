package net.itinajero.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.app.model.CtlEstablecimiento;
import net.itinajero.app.repository.CtlEstablecimientoRepository;
import net.itinajero.app.repository.MyUserRepository;
@Service
public class CtlEstablecimientoJPA implements ICtlEstablecimientoService {
	@Autowired
	private CtlEstablecimientoRepository estRepo;

	@Override
	public List<CtlEstablecimiento> buscarTodas() {
		
		return estRepo.findAll();
	}

}
