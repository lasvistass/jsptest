package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.SpesaInvestimentoConverter;
import com.example.demo.data.dto.SpesaInvestimentoDTO;
import com.example.demo.data.entity.SpesaInvestimento;
import com.example.demo.repository.SpesaInvestimentoRepository;

@Service
public class SpesaInvestimentoServiceImpl  implements SpesaInvestimentoService{
	
	@Autowired
	SpesaInvestimentoRepository spesaRepo;

	
	@Override
		public List<SpesaInvestimentoDTO> findSpesaPerNome(String nome) {
		SpesaInvestimentoConverter spesaConverter = new SpesaInvestimentoConverter();
		List<SpesaInvestimento> spese = spesaRepo.findBySpesaInvestimento(nome);
		return spesaConverter.coverterListaSpesaInDTO(spese);
	}
	
	@Override
	public List<SpesaInvestimentoDTO> findSpesaPerSottoCategoria(String nomeSotto) {
		SpesaInvestimentoConverter spesaConverter = new SpesaInvestimentoConverter();
		List<SpesaInvestimento> spese = spesaRepo.findBySottoNome(nomeSotto);
		return spesaConverter.coverterListaSpesaInDTO(spese);
	}
	
	@Override
	public SpesaInvestimentoDTO findByIdDTO(Integer id) {
		SpesaInvestimento spesaInvestimento = spesaRepo.findById(id).get();
		SpesaInvestimentoConverter spesaConverter = new SpesaInvestimentoConverter();
		return spesaConverter.converterSpesa(spesaInvestimento);
	}

	@Override
	public SpesaInvestimento findById(Integer id) {
		return spesaRepo.findById(id).get();
	}

	@Override
	public List<SpesaInvestimento> findAll() {
		return spesaRepo.findAll();
	}

	@Override
	public SpesaInvestimento save(SpesaInvestimento spesaInvestimento) {
		return spesaRepo.save(spesaInvestimento);
	}

	@Override
	public SpesaInvestimento delete(Integer id) {
		SpesaInvestimento spesa = spesaRepo.findById(id).get();
		spesaRepo.delete(spesa);
		return spesa;
	}





}
