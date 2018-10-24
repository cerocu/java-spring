package com.defensoria.proyecto1.repository.service.implementacion.implemen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.defensoria.proyecto1.entity.Personal;
import com.defensoria.proyecto1.repository.PersonalRepository;
import com.defensoria.proyecto1.repository.defensorRepository;
import com.defensoria.proyecto1.repository.service.implementacion.PersonalService;
@Service("personalServiceImplemen")
public class PersonalServiceImplemen implements PersonalService{

	

@Autowired
@Qualifier("personalRepository")
private PersonalRepository personalReposi;

    @Override
	public List<Personal> listAllPersonal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal addPersonal(Personal personal) {
		return personalReposi.save(personal);
	}

	@Override
	public int removerPersonal(int idPersonal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personal updatePersonal(Personal personal) {
		// TODO Auto-generated method stub
		return null;
	}

}
