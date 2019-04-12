package net.itinajero.app.service;
import java.util.List;
import net.itinajero.app.model.MntPaciente;

public interface IMntPaciente {
	List<MntPaciente> pacientes();
	void insertar(MntPaciente paciente);
	MntPaciente pacienteById(Integer id);
	void eliminar(Integer id);
}
