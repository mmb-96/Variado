package com.bootcamp.springmvc.bootcampmvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.springmvc.bootcampmvc.dto.PaisDTO;
import com.bootcamp.springmvc.bootcampmvc.service.PaisesServiceImpl;

@RestController
@RequestMapping("/")
public class PaisesController {

	@Autowired
	private PaisesServiceImpl paisService;
	
	@GetMapping("/paises")
	public List<PaisDTO> getAllPaises(){
		return paisService.ListaPaises();
		
	}
	
	@PostMapping("/crearPais")
	public void cerarPais(@RequestBody PaisDTO pais) {
		paisService.crearPais(pais);
	}
	
	@GetMapping("/paises/{ID}")
	public PaisDTO findById(@PathVariable String ID) {
		return paisService.findById(ID);
		
	}

}
