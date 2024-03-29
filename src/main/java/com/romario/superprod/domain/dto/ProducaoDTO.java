package com.romario.superprod.domain.dto;

import java.time.OffsetDateTime;
import java.util.Date;

import com.romario.superprod.domain.Maquina;
import com.romario.superprod.domain.Operador;
import com.romario.superprod.domain.Produto;

public class ProducaoDTO {

	private Integer id;
	private String obs;
	private Date dataprevisao;
	private Integer quantidade;
	private String cor;
	private Integer perda;
	private Integer tempomaquina;
	private OffsetDateTime dataproducao;
	private String horainicio;
	private String horafinal;
	private String turno;
	private Boolean status = Boolean.TRUE;
	private Operador operador;
	private Integer idoperador;
	private String nomeoperador;
	private Maquina maquina;
	private Integer idmaquina;
	private Integer nomemaquina;
	private Produto produto;
	private Integer idproduto;
	private String nomeproduto;

	public ProducaoDTO() {
	}

	public ProducaoDTO(Integer id, String obs, Date dataprevisao, Integer quantidade, String cor, Integer perda,
			Integer tempomaquina, OffsetDateTime dataproducao, String horainicio, String horafinal, String turno,
			Boolean status, Operador operador, Integer idoperador, String nomeoperador, Maquina maquina,
			Integer idmaquina, Integer nomemaquina, Produto produto, Integer idproduto, String nomeproduto) {
		this.id = id;
		this.obs = obs;
		this.dataprevisao = dataprevisao;
		this.quantidade = quantidade;
		this.cor = cor;
		this.perda = perda;
		this.tempomaquina = tempomaquina;
		this.dataproducao = dataproducao;
		this.horainicio = horainicio;
		this.horafinal = horafinal;
		this.turno = turno;
		this.status = status;
		this.operador = operador;
		this.idoperador = idoperador;
		this.nomeoperador = nomeoperador;
		this.maquina = maquina;
		this.idmaquina = idmaquina;
		this.nomemaquina = nomemaquina;
		this.produto = produto;
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Date getDataprevisao() {
		return dataprevisao;
	}

	public void setDataprevisao(Date dataprevisao) {
		this.dataprevisao = dataprevisao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getPerda() {
		return perda;
	}

	public void setPerda(Integer perda) {
		this.perda = perda;
	}

	public Integer getTempomaquina() {
		return tempomaquina;
	}

	public void setTempomaquina(Integer tempomaquina) {
		this.tempomaquina = tempomaquina;
	}

	public OffsetDateTime getDataproducao() {
		return dataproducao;
	}

	public void setDataproducao(OffsetDateTime dataproducao) {
		this.dataproducao = dataproducao;
	}

	public String getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}

	public String getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Maquina getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getIdoperador() {
		return idoperador;
	}

	public void setIdoperador(Integer idoperador) {
		this.idoperador = idoperador;
	}

	public String getNomeoperador() {
		return nomeoperador;
	}

	public void setNomeoperador(String nomeoperador) {
		this.nomeoperador = nomeoperador;
	}

	public Integer getIdmaquina() {
		return idmaquina;
	}

	public void setIdmaquina(Integer idmaquina) {
		this.idmaquina = idmaquina;
	}

	public Integer getNomemaquina() {
		return nomemaquina;
	}

	public void setNomemaquina(Integer nomemaquina) {
		this.nomemaquina = nomemaquina;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public ProducaoDTO(ProducaoDTO obj) {
		this.id = obj.getId();
		this.obs = obj.getObs();
		this.dataprevisao = obj.getDataprevisao();
		this.quantidade = obj.getQuantidade();
		this.cor = obj.getCor();
		this.perda = obj.getPerda();
		this.tempomaquina = obj.getTempomaquina();
		this.dataproducao = obj.getDataproducao();
		this.horainicio = obj.getHorainicio();
		this.horafinal = obj.getHorafinal();
		this.turno = obj.getTurno();
		this.status = obj.getStatus();
		this.maquina = obj.getMaquina();
		this.idmaquina = obj.maquina.getId();
		this.nomemaquina = obj.maquina.getNumero();
		this.operador = obj.getOperador();
		this.idoperador = obj.getOperador().getId();
		this.nomeoperador = obj.getOperador().getNome();
		this.produto = obj.getProduto();
		this.idproduto = obj.produto.getId();
		this.nomeproduto = obj.produto.getNome();
	}

}
