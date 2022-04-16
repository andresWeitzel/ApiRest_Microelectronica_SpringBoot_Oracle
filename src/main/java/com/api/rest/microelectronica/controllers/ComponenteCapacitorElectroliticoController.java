package com.api.rest.microelectronica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
@RequestMapping("/v1/componentes-capacitores-electroliticos")
public class ComponenteCapacitorElectroliticoController {

	@Autowired
	private ComponenteCapacitorElectroliticoService componenteCapacitorElectroliticoService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public void addComponente(@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		componenteCapacitorElectroliticoService.addCapacitorElectrolitico(componenteCapacitorElectrolitico);
	}

	// ----PUT-----
	@PutMapping("/")
	public void updateComponente(
			@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		componenteCapacitorElectroliticoService.updateCapacitorElectrolitico(componenteCapacitorElectrolitico);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public void deleteComponente(@PathVariable("id") int id) {

		componenteCapacitorElectroliticoService.deleteCapacitorElectrolitico(id);
	}

	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteCapacitorElectroliticoEntity> getAll(Pageable pageable) {

		return componenteCapacitorElectroliticoService.getAllCapacitorElectrolitico(pageable);
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
	public Page<ComponenteCapacitorElectroliticoEntity> getByTipo(@PathVariable("tipo") String tipo , Pageable pageable) {

		return componenteCapacitorElectroliticoService.findByTipo(tipo, pageable );
	}
	
	// ---GET---
	@GetMapping("/capacitancia/{capacitancia}")
	public Page<ComponenteCapacitorElectroliticoEntity> getByCapacitancia(@PathVariable("capacitancia") String capacitancia , Pageable pageable) {

		return componenteCapacitorElectroliticoService.findByCapacitancia(capacitancia , pageable);
	}
	
	
	// ---GET---
	@GetMapping("/tolerancia/{tolerancia}")
	public Page<ComponenteCapacitorElectroliticoEntity> getByTolerancia(@PathVariable("tolerancia") String tolerancia , Pageable pageable) {

		return componenteCapacitorElectroliticoService.findByTolerancia(tolerancia , pageable);
	}
	
	
	// ---GET---
	@GetMapping("/rango-temperatura/{rangoTemp}")
	public Page<ComponenteCapacitorElectroliticoEntity> getByRangoTemperatura(@PathVariable("rangoTemp") String rangoTemperatura , Pageable pageable) {

		return componenteCapacitorElectroliticoService.findByRangoTemperatura(rangoTemperatura ,  pageable);
	}
	
	// ---GET---
	@GetMapping("/rango-tension-nominal/{rangoTensNom}")
	public Page<ComponenteCapacitorElectroliticoEntity> getByRangoTensionNominal(@PathVariable("rangoTensNom") String rangoTensionNominal , Pageable pageable) {

		return componenteCapacitorElectroliticoService.findByRangoTensionNominal(rangoTensionNominal , pageable);
	}
	
	
	
	
	
	
	
	
	
	

}
