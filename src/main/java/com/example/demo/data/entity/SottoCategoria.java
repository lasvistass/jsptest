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
@Table( name="SottoCategoria")
@Data
public class SottoCategoria {
	
	@Column(name ="IdSottoCategoria")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idSottoCategoria;
	
	@Column(name ="Codice")
	private int codice;
	
	@Column(name ="SottoCategoria")
	private String sottoCategoria;
	
	@Column(name ="Budget")
	private Long budget;
	
	@Column(name ="BudgetSpesa")
	private Long budgetSpesa;
	
	@ManyToOne
	@JoinColumn(name="IdArea")
	private Area area;

	public Integer getIdSottoCategoria() {
		return idSottoCategoria;
	}

	public void setIdSottoCategoria(Integer idSottoCategoria) {
		this.idSottoCategoria = idSottoCategoria;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getSottoCategoria() {
		return sottoCategoria;
	}

	public void setSottoCategoria(String sottoCategoria) {
		this.sottoCategoria = sottoCategoria;
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	

}
