package net.itinajero.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="CTL_TIPO_EMPLEADO")
public class CtlTipoEmpleado {
	@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "CtlTipoEmpleado [id=" + id + ", tipo=" + tipo + "]";
	}
	

}
