package com.joaldo.vacinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaldo.vacinas.entities.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long>{

}
