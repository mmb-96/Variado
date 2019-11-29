package com.bootcamp.springmvc.bootcampmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bootcamp.springmvc.bootcampmvc.model.PaisEntity;

@Repository
public class PaisesRepositiryImpl implements IPaisesRepository {
	
	private List<PaisEntity> listaDePaises = new ArrayList<PaisEntity>();

	@Override
	public List<PaisEntity> ListaPaises() {
		this.inicializarDatos();
//		List<PaisEntity> listaDePaises = new ArrayList<PaisEntity>();
//		PaisEntity paisEntity1 = new PaisEntity();
//		paisEntity1.setId("1");
//		paisEntity1.setDescripcion("España");
//		listaDePaises.add(paisEntity1);
//		PaisEntity paisEntity2 = new PaisEntity();
//		paisEntity2.setId("2");
//		paisEntity2.setDescripcion("Italia");
//		listaDePaises.add(paisEntity2);
//		PaisEntity paisEntity3 = new PaisEntity();
//		paisEntity3.setId("3");
//		paisEntity3.setDescripcion("Alemania");
//		listaDePaises.add(paisEntity3);
		return listaDePaises;
	}
	
	@Override
	public void crearPais(PaisEntity pais) {
		listaDePaises.add(pais);		
	}
	
	@Override
	public PaisEntity findById(String id) {
		PaisEntity paisEncontrado = new PaisEntity();
		for (PaisEntity paisEntity : listaDePaises) {
			if (paisEntity.getId().equals(id)) {
				paisEncontrado = paisEntity;
			}
		}
		return paisEncontrado;
	}
	
	private void inicializarDatos() {
		PaisEntity paisEntity1 = new PaisEntity();
		paisEntity1.setId("1");
		paisEntity1.setDescripcion("España");
		this.listaDePaises.add(paisEntity1);
		PaisEntity paisEntity2 = new PaisEntity();
		paisEntity2.setId("2");
		paisEntity2.setDescripcion("Italia");
		this.listaDePaises.add(paisEntity2);
		PaisEntity paisEntity3 = new PaisEntity();
		paisEntity3.setId("3");
		paisEntity3.setDescripcion("Alemania");
		this.listaDePaises.add(paisEntity3);
		
	}
}