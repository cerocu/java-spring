package com.defensoria.proyecto1.repository.service.implementacion;

import java.util.List;

import com.defensoria.proyecto1.entity.Defensor;


public interface DefensorService {

	public abstract List<Defensor> listAllDefensor();
	public abstract Defensor addDefensor(Defensor defensor);
	public abstract int removerDefensor(int idDefensor);
	public abstract Defensor updateDefensor(Defensor defensor);
}

