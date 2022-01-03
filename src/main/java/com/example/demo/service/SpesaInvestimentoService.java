package com.example.demo.service;

import java.util.List;

import com.example.demo.data.dto.SpesaInvestimentoDTO;
import com.example.demo.data.entity.SpesaInvestimento;

public interface SpesaInvestimentoService {

	
	SpesaInvestimentoDTO findByIdDTO(Integer id);
	
	SpesaInvestimento findById(Integer id);
	
	List<SpesaInvestimento> findAll();
	
	SpesaInvestimento save(SpesaInvestimento spesaInvestimento);
	
	SpesaInvestimento delete(Integer id);
	
	List<SpesaInvestimentoDTO> findSpesaPerSottoCategoria(String nomeSotto);
	
	List<SpesaInvestimentoDTO> findSpesaPerNome(String nome);
}
