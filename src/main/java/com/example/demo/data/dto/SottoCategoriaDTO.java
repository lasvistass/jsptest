package com.example.demo.data.dto;

import lombok.Data;

@Data
public class SottoCategoriaDTO {

	
	private int codice;
	
	private String Sottocategoria;
	
	private Long budget;
	
	private Long budgetSpesa;
	
	private String area;

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getSottocategoria() {
		return Sottocategoria;
	}

	public void setSottocategoria(String sottocategoria) {
		Sottocategoria = sottocategoria;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getBudgetSpesa() {
		return budgetSpesa;
	}

	public void setBudgetSpesa(Long budgetSpesa) {
		this.budgetSpesa = budgetSpesa;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
