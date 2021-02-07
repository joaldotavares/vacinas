package com.joaldo.vacinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaldo.vacinas.entities.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long>{

}
