package br.com.ecodetech.integracao.model.bean;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Categoria extends AbstractEntityBean {

	private String nome;

	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
