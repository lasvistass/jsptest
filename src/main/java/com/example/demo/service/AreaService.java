package com.example.demo.service;

import java.util.List;

import com.example.demo.data.dto.AreaDTO;
import com.example.demo.data.entity.Area;

public interface AreaService {

	AreaDTO findByIdDTO( Integer id );
	
	Area findById( Integer id );
	
	List<Area> findAll();
	
	Area save( Area area);
	
	Area delete( Integer id);
}
