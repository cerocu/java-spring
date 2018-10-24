package com.defensoria.proyecto1.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defensoria.proyecto1.entity.UsuarioSistema;

@Repository("repositorioUsuarioSistema")
public interface repositorioUsuarioSistema extends JpaRepository<UsuarioSistema,Serializable> {
	
	public abstract UsuarioSistema findByUsername(String username);
	//public abstract UsuarioSistema busquedaPorId(String username);
	
}
