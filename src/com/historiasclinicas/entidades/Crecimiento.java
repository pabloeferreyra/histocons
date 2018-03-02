package com.historiasclinicas.entidades;
// Generated 18-feb-2017 9:47:15 by Hibernate Tools 5.2.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Crecimiento generated by hbm2java
 */
@Entity
@Table(name = "crecimiento", catalog = "histocons")
public class Crecimiento implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7951680593562716321L;
	private Integer edad;
	private Integer idcrecimiento;
	private String imc;
	private int paciente;
	private Float perCef;
	private Integer percPeso;
	private Integer perPerCef;
	private Integer perTalla;
	private Float peso;
	private Float talla;
	private String tiempo;

	public Crecimiento() {
	}

	public Crecimiento(int paciente) {
		this.paciente = paciente;
	}

	public Crecimiento(int paciente, Integer edad, String tiempo, Float peso, Integer percPeso, Float talla,
			Integer perTalla, Float perCef, Integer perPerCef, String imc) {
		this.paciente = paciente;
		this.edad = edad;
		this.tiempo = tiempo;
		this.peso = peso;
		this.percPeso = percPeso;
		this.talla = talla;
		this.perTalla = perTalla;
		this.perCef = perCef;
		this.perPerCef = perPerCef;
		this.imc = imc;
	}

	@Column(name = "Edad")
	public Integer getEdad() {
		return edad;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcrecimiento", unique = true, nullable = false)
	public Integer getIdcrecimiento() {
		return idcrecimiento;
	}

	@Column(name = "Imc", length = 45)
	public String getImc() {
		return imc;
	}

	@Column(name = "paciente", nullable = false)
	public int getPaciente() {
		return paciente;
	}

	@Column(name = "PerCef", precision = 12, scale = 0)
	public Float getPerCef() {
		return perCef;
	}

	@Column(name = "PercPeso")
	public Integer getPercPeso() {
		return percPeso;
	}

	@Column(name = "PerPerCef")
	public Integer getPerPerCef() {
		return perPerCef;
	}

	@Column(name = "PerTalla")
	public Integer getPerTalla() {
		return perTalla;
	}

	@Column(name = "Peso", precision = 12, scale = 0)
	public Float getPeso() {
		return peso;
	}

	@Column(name = "Talla", precision = 12, scale = 0)
	public Float getTalla() {
		return talla;
	}

	@Column(name = "Tiempo", length = 10)
	public String getTiempo() {
		return tiempo;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setIdcrecimiento(Integer idcrecimiento) {
		this.idcrecimiento = idcrecimiento;
	}

	public void setImc(String imc) {
		this.imc = imc;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public void setPerCef(Float perCef) {
		this.perCef = perCef;
	}

	public void setPercPeso(Integer percPeso) {
		this.percPeso = percPeso;
	}

	public void setPerPerCef(Integer perPerCef) {
		this.perPerCef = perPerCef;
	}

	public void setPerTalla(Integer perTalla) {
		this.perTalla = perTalla;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public void setTalla(Float talla) {
		this.talla = talla;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

}