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

import com.example.demo.data.dto.SpesaInvestimentoDTO;
import com.example.demo.data.entity.SpesaInvestimento;
import com.example.demo.service.SpesaInvestimentoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/spesainvestimento")
public class RestSpesaInvestimentoCotroller {

	@Autowired
	SpesaInvestimentoService spesaService;
	
    @ApiOperation(value = "get SpesaInvestimento da nome della Spesa", notes = "endpoint predisposto a ricercare e tornare una o piu SpesaInvestimento", response = SpesaInvestimentoDTO.class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SpesaInvestimento trovata") })
	@GetMapping(value = "/listaPerNome{nome}")
	public List<SpesaInvestimentoDTO> findByNome(@PathVariable("nome") String nome){
		return spesaService.findSpesaPerNome(nome);
	}
	
    @ApiOperation(value = "get SpesaInvestimento da nome della sottocategoria", notes = "endpoint predisposto a ricercare e tornare una o piu SpesaInvestimento", response = SpesaInvestimentoDTO.class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SpesaInvestimetno trovata") })
	@GetMapping(value = "/listaSottoCategoria{nomeSotto}")
	public List<SpesaInvestimentoDTO> findBySottoNome(@PathVariable("nomeSotto") String nomeSotto){
		return spesaService.findSpesaPerSottoCategoria(nomeSotto);
	}
	
    @ApiOperation(value = "get SpesaInvestimento da id", notes = "endpoint predisposto a ricercare e tornare una SpesaInvestimento", response = SpesaInvestimentoDTO.class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SpesaInvestimento trovata") })
	@GetMapping(value = "/{id}")
	public SpesaInvestimentoDTO findById(@PathVariable("id") Integer id) {
		return spesaService.findByIdDTO(id);
	}
    
    @ApiOperation(value = "get Lista SpesaInvestimento", notes = "endpoint predisposto a ricercare e tornare una lista di SpesaInvestimento", response = SpesaInvestimento.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Lista caricata") } )
	@GetMapping(value = "/lista")
    public List<SpesaInvestimento> getAll(){
    	return spesaService.findAll();
    }
    
    @ApiOperation(value = "post crea SpesaInvestimento", notes = "endpoint predisposto a creare una nuova SpesaInvestimento", response = SpesaInvestimento.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "SpesaInvestimento creata") } )
    @PostMapping(value="/newSpesaInvestimento")
	public void newSpesaInvestimento(@RequestBody SpesaInvestimento spesa) {
		spesaService.save(spesa);
	}
    
    @ApiOperation(value = "delete elimina SpesaInvestimento", notes = "endpoint predisposto a eliminare una SpesaInvestimento", response = SpesaInvestimento.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "SpesaInvestimento eliminata") } )
    @DeleteMapping(value="/deleteSpesaInvestimento{id}")
    public void deleteSpesaInvestimentoPerId(@PathVariable("id") Integer id) {
    	spesaService.delete(id);
    }
}
