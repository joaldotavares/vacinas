package com.joaldo.vacinas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaldo.vacinas.dto.UsuarioDTO;
import com.joaldo.vacinas.entities.Usuario;
import com.joaldo.vacinas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	public List<UsuarioDTO> findAll(){
		List<Usuario> list = usuarioRepository.findAll();
		return list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
	}
	
	public Usuario find(Long id){
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow();
	}
	
	@Transactional
	public UsuarioDTO insert(UsuarioDTO dto) {
		Usuario usuario = new Usuario(null, dto.getNome(), dto.getEmail(), dto.getCpf(), dto.getNascimento());
		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	}

}
