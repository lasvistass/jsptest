package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.entity.Area;
import com.example.demo.data.entity.SottoCategoria;
import com.example.demo.service.AreaService;
import com.example.demo.service.SottoCategoriaService;

@Controller
@RequestMapping(value = "/SottoCategoria")
public class SottoCategoriaController {

	@Autowired
	SottoCategoriaService sottoService;
	
	@Autowired
	AreaService areaService;
	
    @GetMapping(value = "/listaSottoCategorie")
    public ModelAndView getSottoCategorie() {
        ModelAndView modelAndView = new ModelAndView();
        List<SottoCategoria> sottoC = sottoService.findAll();
        modelAndView.addObject("elencoSottoCategorie", sottoC);
        modelAndView.setViewName("/SottoCategoria/List");
        return modelAndView;
    }
    
    
    @GetMapping(value = "/EditSottoCategoria/{id}")
    public ModelAndView editArea(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("SottoCategoria/AddEditSottoCategoria");
		List<Area> listaArea = areaService.findAll();
		modelAndView.addObject("elencoArea", listaArea);
        SottoCategoria sottoC = sottoService.findById(id);
        modelAndView.addObject("oggettoSottoCategoria", sottoC);
        return modelAndView;
    }
    
    @GetMapping(value = "/AddEditSottoCategoria")
    public ModelAndView addArea() {
        ModelAndView modelAndView = new ModelAndView("SottoCategoria/AddEditSottoCategoria");
		List<Area> listaArea = areaService.findAll();
		modelAndView.addObject("elencoArea", listaArea);
        SottoCategoria sottoC = new SottoCategoria();
        modelAndView.addObject("oggettoSottoCategoria", sottoC);
        return modelAndView;
    }
    
    @PostMapping(value = "/SaveSottoCategoria")
    public ModelAndView saveSottoCategoria(@ModelAttribute("oggettoSottoCategoria") SottoCategoria sottoC) {
        sottoService.save(sottoC);
        return new ModelAndView("redirect:/SottoCategoria/listaSottoCategorie");
    }
    
    @GetMapping("/DeleteSottoCategoria/{idSottoCategoria}")
    public ModelAndView deleteSottoCategoria(@PathVariable("idSottoCategoria") Integer id) {
        sottoService.delete(id);
        return new ModelAndView("redirect:/SottoCategoria/listaSottoCategorie");
    }
    
}
