package com.defensoria.proyecto1.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defensoria.proyecto1.entity.Personal;
@Repository("personalRepository")
public interface PersonalRepository extends JpaRepository<Personal,Serializable>  {
	public abstract Personal findByNombre(String nombre);
//	public abstract Personal findByIdPersonal(int idpersonal);
	public abstract Personal findByIdCargo(int idcargo);
	public abstract Personal findByNup(String nup);
	public abstract Personal findByCurp(String curp);

	public abstract List<Personal> findByIdPersonal(int idpersonal);
}

