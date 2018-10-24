package com.defensoria.proyecto1.repository.service.implementacion.implemen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.defensoria.component.Console;
import com.defensoria.proyecto1.entity.Defensor;
import com.defensoria.proyecto1.repository.defensorRepository;
import com.defensoria.proyecto1.repository.service.implementacion.DefensorService;
@Service("defensorServiceImplemen")
public class DefensorServiceImplemen implements DefensorService{

@Autowired
@Qualifier("DefensorRepository")
private defensorRepository defensorReposi;
	@Override
	public List<Defensor> listAllDefensor() {
		
		return defensorReposi.findAll();
	}

	@Override
	public Defensor addDefensor(Defensor defensor) {
        Console.println("defensor service implements", "ejecucion valida");
		return defensorReposi.save(defensor);
	}

	@Override
	public int removerDefensor(int idDefensor) {
		defensorReposi.delete(idDefensor);
		return 0;
	}

	@Override
	public Defensor updateDefensor(Defensor defensor) {
		// TODO Auto-generated method stub
		return defensorReposi.save(defensor);
	}

}
