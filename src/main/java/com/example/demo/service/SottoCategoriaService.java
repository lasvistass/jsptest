package com.example.demo.service;

import java.util.List;

import com.example.demo.data.dto.SottoCategoriaDTO;
import com.example.demo.data.entity.SottoCategoria;

public interface SottoCategoriaService {

	
	SottoCategoriaDTO findByIdDTO(Integer id);
	
	SottoCategoria findById(Integer id);
	
	List<SottoCategoria> findAll();
	
	SottoCategoria save(SottoCategoria sottoCategoira);
	
	SottoCategoria delete(Integer id);
	
}
