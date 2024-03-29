package com.histocons.entidades;
// Generated 20-jun-2016 16:53:02 by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Paciente generated by hbm2java
 */
@Entity
@Table(name = "paciente")
public class Paciente implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3863383195212712174L;
	@Id
	@GeneratedValue
	private Integer id;
	private int dni;
	private String nombre;
	private String apellido;
	private String sexo;
	private String obraSocial;
	private String fechaNacimiento;
	private String planOs;
	private Integer nroAfiliado;
	private String provincia;
	private String ciudad;
	private String domicilio;
	private Integer telefono;
	private Integer telefonoCelular;
	private String correo;

	public Paciente() {
		super();
	}

	public Paciente(int dni, String nombre, String apellido, String sexo, String obraSocial, String fechaNacimiento,
			String planOs, Integer nroAfiliado, String provincia, String ciudad, String domicilio, Integer telefono,
			Integer telefonoCelular, String correo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.obraSocial = obraSocial;
		this.fechaNacimiento = fechaNacimiento;
		this.planOs = planOs;
		this.nroAfiliado = nroAfiliado;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.telefonoCelular = telefonoCelular;
		this.correo = correo;
	}

	@GenericGenerator(name = "generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getObraSocial() {
		return this.obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPlanOs() {
		return this.planOs;
	}

	public void setPlanOs(String planOs) {
		this.planOs = planOs;
	}

	public Integer getNroAfiliado() {
		return this.nroAfiliado;
	}

	public void setNroAfiliado(Integer nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getTelefonoCelular() {
		return this.telefonoCelular;
	}

	public void setTelefonoCelular(Integer telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
