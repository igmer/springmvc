package net.itinajero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.MntPaciente;
@Repository
public interface MntPacienteRepository extends JpaRepository<MntPaciente, Integer> {

}
