package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.data.dto.SpesaInvestimentoDTO;
import com.example.demo.data.entity.SpesaInvestimento;

public class SpesaInvestimentoConverter {

	
	public  SpesaInvestimentoDTO converterSpesa(SpesaInvestimento spesa) {
		
		SpesaInvestimentoDTO spesaInvestimentoDTO = new SpesaInvestimentoDTO();
		spesaInvestimentoDTO.setSpesaInvestimento(spesa.getSpesaInvestimento());
		spesaInvestimentoDTO.setSottoCategoria(spesa.getSottoCategoria().getSottoCategoria());
		return spesaInvestimentoDTO;
	}
	
	public List<SpesaInvestimentoDTO> coverterListaSpesaInDTO(List<SpesaInvestimento> spese){
		
		List<SpesaInvestimentoDTO> speseDTO = new ArrayList<>();
		for( int i = 0; i < spese.size(); i++ ) {
			speseDTO.add(converterSpesa(spese.get(i)));
		}
		return speseDTO;
	}
}
