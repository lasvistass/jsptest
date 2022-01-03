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

import com.example.demo.data.dto.SottoCategoriaDTO;
import com.example.demo.data.entity.SottoCategoria;
import com.example.demo.service.SottoCategoriaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/sottocategoria")
public class RestSottoCategoriaController {

	@Autowired
	SottoCategoriaService sottoCategoriaService;
	
    @ApiOperation(value = "get SottoCategoria da id", notes = "endpoint predisposto a ricercare e tornare una SottoCategoria", response = SottoCategoriaDTO.class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SottoCategoria trovata") })
	@GetMapping(value = "/{id}")
	public SottoCategoriaDTO findById(@PathVariable("id") Integer id) {
		return sottoCategoriaService.findByIdDTO(id);
	}
    
    @ApiOperation(value = "get Lista SottoCategoria", notes = "endpoint predisposto a ricercare e tornare una lista di SottoCategoria", response = SottoCategoria.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Lista caricata") } )
	@GetMapping(value = "/lista")
    public List<SottoCategoria> getAll(){
    	return sottoCategoriaService.findAll();
    }
	
    @ApiOperation(value = "post crea SottoCategoria", notes = "endpoint predisposto a creare una nuova SottoCategoria", response = SottoCategoria.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "SottoCategoria creata") } )
    @PostMapping(value="/newSottoCategoria")
	public void newSottoCategoria(@RequestBody SottoCategoria sotto) {
		sottoCategoriaService.save(sotto);
	}
    
    @ApiOperation(value = "delete elimina Area", notes = "endpoint predisposto a eliminare una SottoCategoria", response = SottoCategoria.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "SottoCategoria eliminata") } )
    @DeleteMapping(value="/deleteSottoCategoria{id}")
    public void deleteSottoCategoriaPerId(@PathVariable("id") Integer id) {
    	sottoCategoriaService.delete(id);
    }
}
