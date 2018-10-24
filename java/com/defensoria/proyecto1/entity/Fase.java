package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Fase generated by hbm2java
 */
@Entity
@Table(name = "fase", catalog = "bddefensoriapublica")
public class Fase implements java.io.Serializable {

	private int idFase;
	private String instancia;

	public Fase() {
	}

	public Fase(int idFase, String instancia) {
		this.idFase = idFase;
		this.instancia = instancia;
	}

	@Id

	@Column(name = "idFase", unique = true, nullable = false)
	public int getIdFase() {
		return this.idFase;
	}

	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}

	@Column(name = "instancia", nullable = false, length = 2)
	public String getInstancia() {
		return this.instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

}
