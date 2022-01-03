package com.example.demo.converter;

import com.example.demo.data.dto.SottoCategoriaDTO;
import com.example.demo.data.entity.SottoCategoria;

public class SottoCategoriaConverter {

	
	public SottoCategoriaDTO sottoConverter( SottoCategoria sotto ) {
		
		SottoCategoriaDTO sottoCategoriaDTO = new SottoCategoriaDTO();
		sottoCategoriaDTO.setSottocategoria(sotto.getSottoCategoria());
		sottoCategoriaDTO.setCodice(sotto.getCodice());
		sottoCategoriaDTO.setBudget(sotto.getBudget());
		sottoCategoriaDTO.setBudgetSpesa(sotto.getBudgetSpesa());
		sottoCategoriaDTO.setArea(sotto.getArea().getArea());
		
		return sottoCategoriaDTO;
	}
}
