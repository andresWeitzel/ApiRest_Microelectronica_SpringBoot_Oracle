package com.api.rest.microelectronica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;
import com.api.rest.microelectronica.services.ComponenteCapacitorElectroliticoService;


@RestController
@RequestMapping("/componentes-capacitores-electroliticos")
public class ComponenteCapacitorElectroliticoController {

	@Autowired
	private ComponenteCapacitorElectroliticoService componenteCapacitorElectroliticoService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponente(@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		return componenteCapacitorElectroliticoService.addComponente(componenteCapacitorElectrolitico);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponente(
			@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		return componenteCapacitorElectroliticoService.updateComponente(componenteCapacitorElectrolitico);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponente(@PathVariable("id") int id) {

		return componenteCapacitorElectroliticoService.deleteComponente(id);
	}

	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteCapacitorElectroliticoEntity> getAll(Pageable pageable) {

		return componenteCapacitorElectroliticoService.getAllComponente(pageable);
	}



	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/id/{id}")
	public ComponenteCapacitorElectroliticoEntity getById(@PathVariable("id") int id) {

		return componenteCapacitorElectroliticoService.findById(id);
	}

	// ---GET---
	@GetMapping("/id-componente/{idComp}")
	public ComponenteCapacitorElectroliticoEntity getByIdComponente(@PathVariable("idComp") int id_componente) {

		return componenteCapacitorElectroliticoService.findByIdComponente(id_componente);
	}

	// ---GET---
	@GetMapping("/tipo/{tipo}")
	public List<ComponenteCapacitorElectroliticoEntity> getByTipo(@PathVariable("tipo") String tipo) {

		return componenteCapacitorElectroliticoService.findByTipo(tipo);
	}
	
	// ---GET---
	@GetMapping("/capacitancia/{capacitancia}")
	public List<ComponenteCapacitorElectroliticoEntity> getByCapacitancia(@PathVariable("capacitancia") String capacitancia) {

		return componenteCapacitorElectroliticoService.findByCapacitancia(capacitancia);
	}
	
	
	// ---GET---
	@GetMapping("/tolerancia/{tolerancia}")
	public List<ComponenteCapacitorElectroliticoEntity> getByTolerancia(@PathVariable("tolerancia") String tolerancia) {

		return componenteCapacitorElectroliticoService.findByTolerancia(tolerancia);
	}
	
	
	// ---GET---
	@GetMapping("/rango-temperatura/{rangoTemp}")
	public List<ComponenteCapacitorElectroliticoEntity> getByRangoTemperatura(@PathVariable("rangoTemp") String rangoTemperatura) {

		return componenteCapacitorElectroliticoService.findByRangoTemperatura(rangoTemperatura);
	}
	
	// ---GET---
	@GetMapping("/rango-tension-nominal/{rangoTensNom}")
	public List<ComponenteCapacitorElectroliticoEntity> getByRangoTensionNominal(@PathVariable("rangoTensNom") String rangoTensionNominal) {

		return componenteCapacitorElectroliticoService.findByRangoTensionNominal(rangoTensionNominal);
	}
	
	
	
	
	
	
	
	
	
	

}
