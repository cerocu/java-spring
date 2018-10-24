package com.defensoria.proyecto1.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defensoria.proyecto1.entity.Defensor;

@Repository("DefensorRepository")
public interface defensorRepository extends JpaRepository<Defensor,Serializable> {

	public abstract Defensor findByNoCedulaProfesional(int cedula);
	//public abstract Defensor findByLugarAdscripcion(String adscripcion);
	public abstract List<Defensor> findByIdDefensor(int cedula);
}
