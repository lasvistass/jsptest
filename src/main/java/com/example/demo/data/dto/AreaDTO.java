package com.example.demo.data.dto;

import lombok.Data;

@Data
public class AreaDTO {

	private String codice;
	
	private String area;

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
