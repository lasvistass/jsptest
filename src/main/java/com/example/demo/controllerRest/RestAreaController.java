package com.example.demo.controllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.dto.AreaDTO;
import com.example.demo.data.entity.Area;
import com.example.demo.service.AreaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

	@Autowired
	AreaService areaService;
	
	
    @ApiOperation(value = "get Area da id", notes = "endpoint predisposto a ricercare e tornare un area", response = AreaDTO.class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Area trovata") })
    @GetMapping(value = "/{id}")
	public AreaDTO getById(@PathVariable("id") Integer id) {
		return areaService.findByIdDTO(id);
	}
    
    @ApiOperation(value = "get Lista aree", notes = "endpoint predisposto a ricercare e tornare una lista di aree", response = Area.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Lista caricata") } )
	@GetMapping(value="/lista")
    public List<Area> getAll(){
    	return areaService.findAll();
    }
    
    @ApiOperation(value = "post crea Area", notes = "endpoint predisposto a creare una nuova Area", response = Area.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Area creata") } )
    @PostMapping(value="/newArea")
    public void newArea (@RequestBody Area area) {
    	areaService.save(area);
    }
    
    @ApiOperation(value = "delete elimina Area", notes = "endpoint predisposto a eliminare una Area", response = Area.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Area eliminata") } )
    @DeleteMapping(value="/deleteArea{id}")
    public void deleteAreaPerId(@PathVariable("id") Integer id) {
    	areaService.delete(id);
    }
    
    
    
    
    
    
}
