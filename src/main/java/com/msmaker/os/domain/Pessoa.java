package com.msmaker.os.domain;

import java.util.Objects;

public abstract class Pessoa {

	private Integer id;
	private String nome;
	private String cpsf;
	private String telefone;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, String cpsf, String telefone) {
		this.id = id;
		this.nome = nome;
		this.cpsf = cpsf;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpsf() {
		return cpsf;
	}

	public void setCpsf(String cpsf) {
		this.cpsf = cpsf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpsf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpsf, other.cpsf) && Objects.equals(id, other.id);
	}

	
}
