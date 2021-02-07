package com.joaldo.vacinas.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.joaldo.vacinas.entities.Usuario;
import com.joaldo.vacinas.entities.Vacina;
import com.sun.istack.NotNull;

public class VacinaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 1, max = 100, message = "O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;
	@NotEmpty(message = "Preenchimento obrigatório")
	private Instant instante;
	private Usuario usuario;
	
	public VacinaDTO() {
		super();
	}

	public VacinaDTO(Long id, String nome, Instant instante, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.instante = instante;
		this.usuario = usuario;
	}
	
	public VacinaDTO(Vacina entity) {
		super();
		id = entity.getId();
		nome = entity.getNome();
		instante = entity.getInstante();
		usuario = entity.getUsuario();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getInstante() {
		return instante;
	}

	public void setInstante(Instant instante) {
		this.instante = instante;
	}

	public Usuario getUsuario() {
		return usuario;
	}	
	
}
