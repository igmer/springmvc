package net.itinajero.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.itinajero.app.repository.MntPacienteRepository;

import net.itinajero.app.model.MntPaciente;
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
		// TODO Auto-generated method stub
		return null;
	}

}
