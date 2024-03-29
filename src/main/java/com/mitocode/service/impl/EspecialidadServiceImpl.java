package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Especialidad;
import com.mitocode.repo.IEspecialidadRepo;
import com.mitocode.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired
	private IEspecialidadRepo repo;
	
	@Override
	public Especialidad registrar(Especialidad t) {		
		return repo.save(t);
	}

	@Override
	public Especialidad modificar(Especialidad t) {		
		return repo.save(t);
	}

	@Override
	public Especialidad leer(Integer id) {		
		return repo.findOne(id);
	}

	@Override
	public List<Especialidad> listar() {
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

}
