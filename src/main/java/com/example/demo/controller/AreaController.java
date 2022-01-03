package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.entity.Area;
import com.example.demo.service.AreaService;

@Controller
@RequestMapping(value = "/Area")
public class AreaController {

	@Autowired
	AreaService areaService;
	
    @GetMapping(value = "/listaAree")
    public ModelAndView getAree() {
        ModelAndView modelAndView = new ModelAndView();
        List<Area> aree = areaService.findAll();
        modelAndView.addObject("elencoAree", aree);
        modelAndView.setViewName("/Area/List");
        return modelAndView;
    }
    
    @GetMapping(value = "/EditArea/{id}")
    public ModelAndView editArea(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("Area/AddEditArea");
        Area area = areaService.findById(id);
        modelAndView.addObject("oggettoArea", area);
        return modelAndView;
    }
    
    @GetMapping(value = "/AddEditArea")
    public ModelAndView addArea() {
        ModelAndView modelAndView = new ModelAndView("Area/AddEditArea");
        Area area = new Area();
        modelAndView.addObject("oggettoArea", area);
        return modelAndView;
    }
    
    @PostMapping(value = "/SaveArea")
    public ModelAndView saveArea(@Valid @ModelAttribute("oggettoArea") Area area, BindingResult bindingResult) {
    	if (bindingResult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("Area/AddEditArea");
			return model;
    	}else {
        	areaService.save(area);
            return new ModelAndView("redirect:/Area/listaAree");
    	}

    }
    
    @GetMapping("/DeleteArea/{idarea}")
    public ModelAndView deleteArea(@PathVariable("idarea") Integer id) {
        areaService.delete(id);
        return new ModelAndView("redirect:/Area/listaAree");
    }
    
    
}
