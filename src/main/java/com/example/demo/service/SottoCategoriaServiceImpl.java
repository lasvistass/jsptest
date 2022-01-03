package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.SottoCategoriaConverter;
import com.example.demo.data.dto.SottoCategoriaDTO;
import com.example.demo.data.entity.SottoCategoria;
import com.example.demo.repository.SottoCategoriaRepository;

@Service
public class SottoCategoriaServiceImpl implements SottoCategoriaService {
	
	@Autowired
	SottoCategoriaRepository sottoRepo;

	@Override
	public SottoCategoriaDTO findByIdDTO(Integer id) {
		SottoCategoria sottoCategoria = sottoRepo.findById(id).get();
		SottoCategoriaConverter sottoConverter = new SottoCategoriaConverter();	
		return sottoConverter.sottoConverter(sottoCategoria);
	}

	@Override
	public SottoCategoria findById(Integer id) {
		SottoCategoria sottoCategoria = sottoRepo.findById(id).get();
		return sottoCategoria;
	}

	@Override
	public List<SottoCategoria> findAll() {
		return sottoRepo.findAll();
	}

	@Override
	public SottoCategoria save(SottoCategoria sottoCategoira) {
		return sottoRepo.save(sottoCategoira);
	}

	@Override
	public SottoCategoria delete(Integer id) {
		SottoCategoria sotto = sottoRepo.findById(id).get();
		sottoRepo.delete(sotto);
		return sotto;
	}

}
