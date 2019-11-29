package com.bootcamp.springmvc.bootcampmvc.service;

import java.util.List;

import com.bootcamp.springmvc.bootcampmvc.dto.PaisDTO;

public interface IPaisesService {
	
	List<PaisDTO> ListaPaises();
	
	void crearPais(PaisDTO pais);
	
	PaisDTO findById(String id);

}
