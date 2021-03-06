package br.com.sus.sus.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipamento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seq_equipamento", unique=true, nullable=false)
	private Long id;
	private String tipoEquipamento;
	private String destino;
	private String tempoUso;
	private LocalDate dataRetirada = LocalDate.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTempoUso() {
		return tempoUso;
	}

	public void setTempoUso(String tempoUso) {
		this.tempoUso = tempoUso;
	}
	
	public LocalDate getDataRetirada() {
		return dataRetirada;
	}
	
	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

}
