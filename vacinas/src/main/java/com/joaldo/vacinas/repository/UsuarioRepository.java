package com.joaldo.vacinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaldo.vacinas.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
