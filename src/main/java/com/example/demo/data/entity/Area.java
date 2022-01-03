package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Table( name="Area")
@Data
public class Area {

	@Column(name ="IdArea")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idArea;
	
	@Column(name ="Codice")
	@NotBlank(message = "Il campo non può essere vuoto")
	private String codice;
	
	@Column(name ="Area")
	@NotBlank(message = "Il campo non può essere vuoto")
	private String area;

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
}
