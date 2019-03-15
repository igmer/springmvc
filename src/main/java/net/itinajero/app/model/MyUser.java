package net.itinajero.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name="MYUSER")
public class MyUser {
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String email;
	private String password;
	private Integer habilitado;
	//private Integer idTipoEmpleado;
	//private Integer idEstablecimiento;
	private String salto;
	private String sexo;
	private String telefono;
	@ManyToOne
	@JoinColumn(name = "idEstablecimiento") // foreignKey en la tabla de Horarios
	private CtlEstablecimiento establecimiento;
	public CtlEstablecimiento getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(CtlEstablecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}
	@ManyToOne
	@JoinColumn(name="idTipoEmpleado")
	private CtlTipoEmpleado tipoEmpleado;
	
	
	public CtlTipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(CtlTipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}
	/*public Integer getIdTipoEmpleado() {
		return idTipoEmpleado;
	}
	public void setIdTipoEmpleado(Integer idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}
	public Integer getIdEstablecimiento() {
		return idEstablecimiento;
	}
	public void setIdEstablecimiento(Integer idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}*/
	public String getSalto() {
		return salto;
	}
	public void setSalto(String salto) {
		this.salto = salto;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password
				+ ", habilitado=" + habilitado + ", idTipoEmpleado=" + tipoEmpleado + ", idEstablecimiento="
				+ "" + ", salto=" + salto + ", sexo=" + sexo + ", telefono=" + telefono
				+ ", establecimiento=" + establecimiento + "]";
	}
	

	
	
	
	
		

}
