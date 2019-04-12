package net.itinajero.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity()
@Table(name="MNT_PACIENTE")
public class MntPaciente {
	@SequenceGenerator(name="GEN_MNT_PACIENTE",sequenceName="SEQ_MNT_PACIENTE")
	@Id		
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="GEN_MNT_PACIENTE")
	private Integer id;
	private String nombre;
	private String apellido;
	private String direccion;
	private Date fechaNacimiento;
	private String sexo;
	private String conyuge;
	private String telefono;
	private String lugarTrabajo;
	private Integer estadoCivil;
	private String ocupacion;
	private String expediente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getConyuge() {
		return conyuge;
	}
	public void setConyuge(String conyuge) {
		this.conyuge = conyuge;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getLugarTrabajo() {
		return lugarTrabajo;
	}
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	public Integer getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	@Override
	public String toString() {
		return "MntPaciente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", conyuge=" + conyuge + ", telefono="
				+ telefono + ", lugarTrabajo=" + lugarTrabajo + ", estadoCivil=" + estadoCivil + ", ocupacion="
				+ ocupacion + ", expediente=" + expediente + "]";
	}
	
	
	
	
	
	

}
