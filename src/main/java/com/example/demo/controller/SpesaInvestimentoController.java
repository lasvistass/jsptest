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

import com.example.demo.data.entity.SottoCategoria;
import com.example.demo.data.entity.SpesaInvestimento;
import com.example.demo.service.SottoCategoriaService;
import com.example.demo.service.SpesaInvestimentoService;

@Controller
@RequestMapping(value = "/SpesaInvestimento")
public class SpesaInvestimentoController {

	@Autowired
	SpesaInvestimentoService spesaService;
	
	@Autowired
	SottoCategoriaService sottoService;
	
    @GetMapping(value = "/listaSpesaInvestimento")
    public ModelAndView getSpesaInvestimento() {
        ModelAndView modelAndView = new ModelAndView();
        List<SpesaInvestimento> spesaI = spesaService.findAll();
        modelAndView.addObject("elencoSpesaInvestimento", spesaI);
        modelAndView.setViewName("/SpesaInvestimento/List");
        return modelAndView;
    }
    
    @GetMapping(value = "/EditSpesaInvestimento/{id}")
    public ModelAndView editSpesaInvestimento(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("SpesaInvestimento/AddEditSpesaInvestimento");
		List<SottoCategoria> sottoC = sottoService.findAll();
		modelAndView.addObject("elencoSottoCategorie", sottoC);
        SpesaInvestimento spesaI = spesaService.findById(id);
        modelAndView.addObject("oggettoSpesaInvestimento", spesaI);
        return modelAndView;
    }
    
    @GetMapping(value = "/AddEditSpesaInvestimento")
    public ModelAndView addSpesaInvestimento() {
        ModelAndView modelAndView = new ModelAndView("SpesaInvestimento/AddEditSpesaInvestimento");
		List<SottoCategoria> sottoC = sottoService.findAll();
		modelAndView.addObject("elencoSottoCategorie", sottoC);
        SpesaInvestimento spesaI = new SpesaInvestimento();
        modelAndView.addObject("oggettoSpesaInvestimento", spesaI);
        return modelAndView;
    }
    
    @PostMapping(value = "/SaveSpesaInvestimento")
    public ModelAndView saveSpesaInvestimento(@ModelAttribute("oggettoSpesaInvestimento") SpesaInvestimento spesaI) {
        spesaService.save(spesaI);
        return new ModelAndView("redirect:/SpesaInvestimento/listaSpesaInvestimento");
    }
    
    @GetMapping("/DeleteSpesaInvestimento/{idSpesaInvestimento}")
    public ModelAndView deleteSpesaInvestimentoa(@PathVariable("idSpesaInvestimento") Integer id) {
        spesaService.delete(id);
        return new ModelAndView("redirect:/SpesaInvestimento/listaSpesaInvestimento");
    }
    
}
