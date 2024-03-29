package com.romario.superprod.domain.dto.flat;

import java.time.OffsetDateTime;

import com.romario.superprod.domain.Molde;
import com.romario.superprod.domain.Operador;

public class MoldeFlat {

	private Integer id;
	private String nome;
	private String sku;
	private OffsetDateTime datagravacao;
	private String loginusuario;
	private Boolean status = Boolean.TRUE;

	public MoldeFlat() {
	}

	public MoldeFlat(Integer id, String nome, String sku, OffsetDateTime datagravacao, String loginusuario,
			Boolean status) {
		this.id = id;
		this.nome = nome;
		this.sku = sku;
		this.datagravacao = datagravacao;
		this.loginusuario = loginusuario;
		this.status = status;
	}

	public MoldeFlat(Molde obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.datagravacao = obj.getLogs().getDatagravacao();
		this.loginusuario = obj.getLogs().getLoginusuario();
		this.sku = obj.getSku();
		this.status = obj.getStatus();
		
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public OffsetDateTime getDatagravacao() {
		return datagravacao;
	}

	public void setDatagravacao(OffsetDateTime datagravacao) {
		this.datagravacao = datagravacao;
	}

	public String getLoginusuario() {
		return loginusuario;
	}

	public void setLoginusuario(String loginusuario) {
		this.loginusuario = loginusuario;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	

}
