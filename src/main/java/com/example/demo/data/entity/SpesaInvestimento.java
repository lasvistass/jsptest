package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name="SpesaInvestimento")
@Data
public class SpesaInvestimento {

	@Column(name ="IdSpesaInvestimento")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer IdSpesaInvestimento;
	
	@Column(name ="SpesaInvestimento")
	private String spesaInvestimento;
	
	@ManyToOne
	@JoinColumn(name="IdSottoCategoria")
	private SottoCategoria sottoCategoria;

	public Integer getIdSpesaInvestimento() {
		return IdSpesaInvestimento;
	}

	public void setIdSpesaInvestimento(Integer idSpesaInvestimento) {
		IdSpesaInvestimento = idSpesaInvestimento;
	}

	public String getSpesaInvestimento() {
		return spesaInvestimento;
	}

	public void setSpesaInvestimento(String spesaInvestimento) {
		this.spesaInvestimento = spesaInvestimento;
	}

	public SottoCategoria getSottoCategoria() {
		return sottoCategoria;
	}

	public void setSottoCategoria(SottoCategoria sottoCategoria) {
		this.sottoCategoria = sottoCategoria;
	}
	
	
	
}
