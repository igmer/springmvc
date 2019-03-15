package net.itinajero.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="Ctl_Establecimiento")
public class CtlEstablecimiento {
	  @Id		
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  private Integer id_tipo_establecimiento;
	  private String nombre;
	  private String direccion; 
	  private String telefono; 
	  private String fax;
	  private float latitud ;
	  private float longitud;
	  private Integer id_institucion;
	  private Integer id_municipio;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getId_tipo_establecimiento() {
		return id_tipo_establecimiento;
	}
	public void setId_tipo_establecimiento(Integer id_tipo_establecimiento) {
		this.id_tipo_establecimiento = id_tipo_establecimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public float getLatitud() {
		return latitud;
	}
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public Integer getId_institucion() {
		return id_institucion;
	}
	public void setId_institucion(Integer id_institucion) {
		this.id_institucion = id_institucion;
	}
	public Integer getId_municipio() {
		return id_municipio;
	}
	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}
	@Override
	public String toString() {
		return "CtlEstablecimiento [id=" + id + ", id_tipo_establecimiento=" + id_tipo_establecimiento + ", nombre="
				+ nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fax=" + fax + ", latitud="
				+ latitud + ", longitud=" + longitud + ", id_institucion=" + id_institucion + ", id_municipio="
				+ id_municipio + "]";
	}
	  
	  

}
