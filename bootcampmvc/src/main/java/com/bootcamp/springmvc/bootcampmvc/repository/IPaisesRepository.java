package com.bootcamp.springmvc.bootcampmvc.repository;

import java.util.List;

import com.bootcamp.springmvc.bootcampmvc.model.PaisEntity;

public interface IPaisesRepository {
	
	List<PaisEntity> ListaPaises();
	
	void crearPais(PaisEntity pais);
	
	PaisEntity findById(String id);
}
