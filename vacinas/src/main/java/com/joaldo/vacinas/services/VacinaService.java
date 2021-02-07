package com.joaldo.vacinas.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaldo.vacinas.dto.VacinaDTO;
import com.joaldo.vacinas.entities.Vacina;
import com.joaldo.vacinas.repository.VacinaRepository;


@Service
public class VacinaService {
	
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@Transactional(readOnly = true)
	public List<VacinaDTO> findAll(){
		List<Vacina> list = vacinaRepository.findAll();
		return list.stream().map(x -> new VacinaDTO(x)).collect(Collectors.toList());
	}
	
	public Vacina find(Long id) {
		Optional<Vacina> obj = vacinaRepository.findById(id);
		return obj.orElseThrow();
	}
		
	@Transactional
	public VacinaDTO insert(VacinaDTO obj) {
		Vacina vacina = new Vacina(null, obj.getNome(), Instant.now(), obj.getUsuario());
		
		return new VacinaDTO(vacina);
	}
	
	public Vacina fromDTO(VacinaDTO dto) {
		return new Vacina(dto.getId(), dto.getNome(), dto.getInstante(), dto.getUsuario());
	}

}
