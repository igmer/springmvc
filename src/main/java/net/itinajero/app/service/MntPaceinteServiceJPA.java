package net.itinajero.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.itinajero.app.repository.MntPacienteRepository;

import net.itinajero.app.model.MntPaciente;
import net.itinajero.app.model.MyUser;
@Service
public class MntPaceinteServiceJPA implements IMntPaciente {
	@Autowired
	MntPacienteRepository repoPx;
	@Override
	public List<MntPaciente> pacientes() {
		
		return repoPx.findAll();
	}

	@Override
	public void insertar(MntPaciente paciente) {
		repoPx.save(paciente);

	}

	@Override
	public MntPaciente pacienteById(Integer id) {
		Optional<MntPaciente> optional = repoPx.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		repoPx.deleteById(id);
		
	}
	

}
