package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.dto.AreaDTO;
import com.example.demo.data.entity.Area;
import com.example.demo.repository.AreaRepository;
import com.example.demo.converter.*;

@Service
public class AreaServiceImpl  implements  AreaService{
	
	@Autowired
	AreaRepository areaRepository;

	@Override
	public AreaDTO findByIdDTO(Integer id) {
		Area area =  areaRepository.findById(id).get();
		AreaConverter areac = new AreaConverter();
		AreaDTO areaDTO = areac.convertiArea(area);
		return areaDTO;
	}

	@Override
	public Area findById(Integer id) {
		Area area = areaRepository.findById(id).get();
		return area;
	}

	@Override
	public List<Area> findAll() {
		List<Area> aree = areaRepository.findAll();
		return aree;
	}

	@Override
	public Area save(Area area) {
		return areaRepository.save(area);
		
	}

	@Override
	public Area delete(Integer id) {
		Area area = areaRepository.findById(id).get();
		areaRepository.delete(area);
		return area;
	}

}
