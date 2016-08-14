package com.histocons.entidades;
// Generated 20-jun-2016 1:50:13 by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Ciudad generated by hbm2java
 */
@Entity
@Table(name = "ciudad")
public class Ciudad implements java.io.Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String ciudadNombre;
	private int cp;
	private short provinciaId;

	public Ciudad() {
	}

	public Ciudad(int id, String ciudadNombre, int cp, short provinciaId) {
		this.id = id;
		this.ciudadNombre = ciudadNombre;
		this.cp = cp;
		this.provinciaId = provinciaId;
	}

	@GenericGenerator(name = "generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudadNombre() {
		return this.ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

	public int getCp() {
		return this.cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public short getProvinciaId() {
		return this.provinciaId;
	}

	public void setProvinciaId(short provinciaId) {
		this.provinciaId = provinciaId;
	}

}
