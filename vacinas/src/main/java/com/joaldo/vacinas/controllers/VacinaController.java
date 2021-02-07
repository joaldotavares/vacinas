package com.joaldo.vacinas.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.joaldo.vacinas.dto.VacinaDTO;
import com.joaldo.vacinas.entities.Vacina;
import com.joaldo.vacinas.services.VacinaService;

@RestController
@RequestMapping(value = "/vacinas")
public class VacinaController {
	
	@Autowired
	private VacinaService service;
	
	@GetMapping
	public ResponseEntity<List<VacinaDTO>> findAll(){
		List<VacinaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vacina> find(@PathVariable Long id){
		Vacina obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<VacinaDTO> insert(@RequestBody VacinaDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
