package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.FetchType;


@Entity
@Table(name = "usuario_sistema", catalog = "bddefensoriapublica")
public class UsuarioSistema implements java.io.Serializable {

	private int idUsuarioSistema;
	private int idPersonal;
	private String username;
	private String password;
	private boolean estado;
	private Set<Cargos> rolesUsuario=new HashSet<Cargos>();
	
	@Column(name = "estado", nullable = false)
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

    @OneToMany(fetch=FetchType.EAGER,mappedBy="usuariosistema")
	public Set<Cargos> getRolesUsuario() {
		return rolesUsuario;
	}

	public void setRolesUsuario(Set<Cargos> rolesUsuario) {
		this.rolesUsuario = rolesUsuario;
	}

	public UsuarioSistema() {
	}

	public UsuarioSistema(int idUsuarioSistema, int idPersonal, String username, String password,boolean estado ) {
		this.idUsuarioSistema = idUsuarioSistema;
		this.idPersonal = idPersonal;
		this.username = username;
		this.password = password;
		this.estado=estado;
	}

	public UsuarioSistema(int idUsuarioSistema, int idPersonal, String username, String password, boolean estado,
			Set<Cargos> rolesUsuario) {
		super();
		this.idUsuarioSistema = idUsuarioSistema;
		this.idPersonal = idPersonal;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.rolesUsuario = rolesUsuario;
	}

	

//	@Column(name = "idUsuario_Sistema", unique = true, nullable = false)
	@Column(name = "idUsuario_Sistema", nullable = false)
	public int getIdUsuarioSistema() {
		return this.idUsuarioSistema;
	}

	public void setIdUsuarioSistema(int idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}

	@Column(name = "idPersonal", nullable = false)
	public int getIdPersonal() {
		return this.idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}
	@Id
	@Column(name = "username",unique=true, nullable = false,length=45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
