package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.data.entity.Area;
import com.example.demo.data.entity.SottoCategoria;
import com.example.demo.data.entity.SpesaInvestimento;
import com.example.demo.service.AreaService;
import com.example.demo.service.SottoCategoriaService;
import com.example.demo.service.SpesaInvestimentoService;

@SpringBootTest
class CorsoSpringBootApplicationTests {

	@Autowired
	AreaService areaService;
	
	@Autowired
	SottoCategoriaService sottoService;
	
	@Autowired
	SpesaInvestimentoService spesaService;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testGetAllArea() {
		assertThat(areaService.findAll()!=null);
	}
	
	@Test
	void testAddArea() {
		Area area = new Area();
		area.setArea("Pescara");
		area.setCodice("ABB");
		
		assertEquals( area, areaService.save(area));
	}
	
	@Test
	void testRemoveArea() {
		Area area = areaService.findById(35);
		assertEquals( area, areaService.delete(35));
	}
	
	@Test
	void testGetAllSottoCategoria() {
		assertThat(sottoService.findAll()!=null);
	}
	
	@Test
	void testAddSottoCategoria() {
		Area area = areaService.findById(1);
		SottoCategoria sotto = new SottoCategoria();
		sotto.setBudget((long) 10000);
		sotto.setBudgetSpesa((long) 5000);
		sotto.setCodice(125);
		sotto.setSottoCategoria("DIstretto");
		sotto.setArea(area);
		
		assertEquals(sotto, sottoService.save(sotto));
	}
	
	@Test
	void testRemoveSottoCategoria() {
		SottoCategoria sotto = sottoService.findById(2);
		assertEquals(sotto, sottoService.delete(2));
	}
	
	@Test
	void testGetAllSpesaInvestimento() {
		assertThat(spesaService.findAll()!=null);
	}
	
	@Test
	void testAddSpesaInvestiento() {
		SottoCategoria sotto = sottoService.findById(22);
		SpesaInvestimento spesa = new SpesaInvestimento();
		spesa.setSpesaInvestimento("Decorazione");
		spesa.setSottoCategoria(sotto);
		
		assertEquals(spesa, spesaService.save(spesa));			

	}
	
	@Test
	void testRemoveSpesaInvestimento() {
		SpesaInvestimento spesa = spesaService.findById(4);
		assertEquals(spesa, spesaService.delete(4));
	}
	
	@Test
	void testFindSpesaPerSottoCategoria() {
		assertThat(spesaService.findSpesaPerSottoCategoria("Distretto")!=null);
	}
	
	@Test
	void testFindSpesaPerNome() {
		assertThat(spesaService.findSpesaPerNome("Rinnovo")!=null);
	}
	
}
