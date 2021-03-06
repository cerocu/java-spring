package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Personal generated by hbm2java
 */
@Entity
@Table(name = "personal", catalog = "bddefensoriapublica")
public class Personal implements java.io.Serializable {

	private int idPersonal;
	private int idCargo;
	private String nombre;
	private String apMaterno;
	private String apPaterno;
	private String nup;
	private String nue;
	private String sexo;
	private String curp;
	private String telefono;
	private String correoElectronico;
	@OneToOne(cascade=CascadeType.ALL)
    private Defensor defensor;
	public Personal() {
	}

	public Personal(int idPersonal, int idCargo, String nombre, String apMaterno, String apPaterno, String nup,
			String nue, String sexo, String curp, String telefono, String correoElectronico) {
		this.idPersonal = idPersonal;
		this.idCargo = idCargo;
		this.nombre = nombre;
		this.apMaterno = apMaterno;
		this.apPaterno = apPaterno;
		this.nup = nup;
		this.nue = nue;
		this.sexo = sexo;
		this.curp = curp;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Personal", unique = true, nullable = false)
	public int getIdPersonal() {
		return this.idPersonal;
	}

	public Defensor getDefensor() {
		return defensor;
	}

	public void setDefensor(Defensor defensor) {
		this.defensor = defensor;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	@Column(name = "idCargo", nullable = false)
	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ap_materno", nullable = false, length = 45)
	public String getApMaterno() {
		return this.apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	@Column(name = "ap_paterno", nullable = false, length = 45)
	public String getApPaterno() {
		return this.apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	@Column(name = "nup", nullable = false, length = 8)
	public String getNup() {
		return this.nup;
	}

	public void setNup(String nup) {
		this.nup = nup;
	}

	@Column(name = "nue", nullable = false, length = 8)
	public String getNue() {
		return this.nue;
	}

	public void setNue(String nue) {
		this.nue = nue;
	}

	@Column(name = "sexo", nullable = false, length = 2)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "curp", nullable = false, length = 18)
	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Column(name = "telefono", nullable = false, length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "correo_electronico", nullable = false, length = 45)
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Personal [idPersonal=" + idPersonal + ", idCargo=" + idCargo + ", nombre=" + nombre + ", apMaterno="
				+ apMaterno + ", apPaterno=" + apPaterno + ", nup=" + nup + ", nue=" + nue + ", sexo=" + sexo
				+ ", curp=" + curp + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico
				+ ", defensor=" + defensor + "]";
	}

}
