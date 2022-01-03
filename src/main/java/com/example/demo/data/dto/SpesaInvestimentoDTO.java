package com.example.demo.data.dto;

import lombok.Data;

@Data
public class SpesaInvestimentoDTO {

	private String spesaInvestimento;
	
	private String sottoCategoria;

	public String getSpesaInvestimento() {
		return spesaInvestimento;
	}

	public void setSpesaInvestimento(String spesaInvestimento) {
		this.spesaInvestimento = spesaInvestimento;
	}

	public String getSottoCategoria() {
		return sottoCategoria;
	}

	public void setSottoCategoria(String sottoCategoria) {
		this.sottoCategoria = sottoCategoria;
	}
	
	
}
