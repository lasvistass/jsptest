package com.example.demo.converter;

import com.example.demo.data.dto.AreaDTO;
import com.example.demo.data.entity.Area;

public class AreaConverter {

	public AreaDTO convertiArea( Area area ) {
		
		AreaDTO areaDTO = new AreaDTO();
		areaDTO.setCodice(area.getCodice());
		areaDTO.setArea(area.getArea());
		return areaDTO;
	}
	
}
