package com.bootcamp.springmvc.bootcampmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.springmvc.bootcampmvc.dto.PaisDTO;
import com.bootcamp.springmvc.bootcampmvc.model.PaisEntity;
import com.bootcamp.springmvc.bootcampmvc.repository.PaisesRepositiryImpl;

@Service
public class PaisesServiceImpl implements IPaisesService {
	
	@Autowired
	private PaisesRepositiryImpl paisesRepository;

	@Override
	public List<PaisDTO> ListaPaises() {
		List<PaisDTO> lista = new ArrayList<PaisDTO>();
		List<PaisEntity> listaAux = paisesRepository.ListaPaises();
		
		for (PaisEntity paisesEntity : listaAux) {
			PaisDTO paisDTO = new PaisDTO();
			paisDTO.setId(paisesEntity.getId());
			paisDTO.setDescripcion(paisesEntity.getDescripcion());		
			lista.add(paisDTO);			
		}
		
		return lista;
	}

	@Override
	public void crearPais(PaisDTO pais) {
		PaisEntity paisEntity = new PaisEntity();
		paisEntity.setId(pais.getId());
		paisEntity.setDescripcion(pais.getDescripcion());
		paisesRepository.crearPais(paisEntity);
		
	}

	@Override
	public PaisDTO findById(String id) {
		PaisEntity paisEntity = paisesRepository.findById(id);
		PaisDTO paisDTO = new PaisDTO();
		paisDTO.setId(paisEntity.getId());
		paisDTO.setDescripcion(paisEntity.getDescripcion());		
		return paisDTO;
	}
	
	

}
