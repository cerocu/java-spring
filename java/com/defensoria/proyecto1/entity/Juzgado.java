package com.defensoria.proyecto1.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Juzgado {


@Id

@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id_juzgado", unique = true, nullable = false)
private 		 int id;

@Column(name = "juzgado", nullable = false, length = 100)
private String   juzgado;

@Column(name = "lugar_adscripcion", nullable = false, length =20)
private String	 region;

@Column(name = "lugar_adscripcion", nullable = false, length = 45)
private String   direccion;

@Column(name = "lugar_adscripcion", nullable = false, length = 6)
private String	 cp;

@Column(name = "lugar_adscripcion", nullable = false, length = 12)
private String	 telefono;

public Juzgado(int id, String juzgado, String region, String direccion, String cp, String telefono) {
	super();
	this.id = id;
	this.juzgado = juzgado;
	this.region = region;
	this.direccion = direccion;
	this.cp = cp;
	this.telefono = telefono;
}

public Juzgado() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getJuzgado() {
	return juzgado;
}

public void setJuzgado(String juzgado) {
	this.juzgado = juzgado;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCp() {
	return cp;
}

public void setCp(String cp) {
	this.cp = cp;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

	
}
