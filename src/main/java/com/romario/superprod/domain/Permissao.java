package com.romario.superprod.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Permissao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;

	@JsonIgnore
	@ManyToOne
	private Classepermissao classepermissao;

	public Permissao() {
	}

	public Permissao(Integer id, String descricao, Classepermissao classepermissao) {
		this.id = id;
		this.descricao = descricao;
		this.classepermissao = classepermissao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Classepermissao getClassepermissao() {
		return classepermissao;
	}

	public void setClassepermissao(Classepermissao classepermissao) {
		this.classepermissao = classepermissao;
	}


	@Override
	public String toString() {
		return "Permissao [id=" + id + ", descricao=" + descricao + ", classepermissao=" + classepermissao + "]";
	}
	
	public Permissao(int id2, String descricao2) {
		this.id = id2;
		this.descricao = descricao2;
	}

}
