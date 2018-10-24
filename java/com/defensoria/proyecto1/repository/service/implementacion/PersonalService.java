package com.defensoria.proyecto1.repository.service.implementacion;

import java.util.List;

import com.defensoria.proyecto1.entity.Personal;

public interface PersonalService {
	public abstract List<Personal> listAllPersonal();
	public abstract Personal addPersonal(Personal personal);
	public abstract int removerPersonal(int idPersonal);
	public abstract Personal updatePersonal(Personal personal);
}
