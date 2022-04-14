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

import com.api.rest.microelectronica.entities.ComponenteEntity;
import com.api.rest.microelectronica.services.ComponenteService;


@RestController
@RequestMapping("/componentes")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	// ===============================================
	// ============= MÉTODOS HTTP CRUD ==============
	// ===============================================

	// ----POST----
	@PostMapping("/")
	public boolean addComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.addComponente(componente);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.updateComponente(componente);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponente(@PathVariable("id") int id) {

		return componenteService.deleteComponente(id);
	}

	// ---GET---
	// ---LISTADO PAGINADO Y COMPLETO---
	@GetMapping("/listado")
	public List<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}

	// ==================================================
	// ============= MÉTODOS HTTP BÚSQUEDA =============
	// ==================================================

	// ---GET---
	@PostMapping("/id/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}

	// ---GET---
	@GetMapping("/codigo/{codigo}")
	public List<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo) {

		return componenteService.findByCodigo(codigo);
	}

	// ---GET---
	@GetMapping("/imagen/{imagen}")
	public List<ComponenteEntity> getByImagen(@PathVariable("imagen") String imagen) {

		return componenteService.findByImagen(imagen);
	}

	// ---GET---
	@GetMapping("/nro-de-pieza/{nroPieza}")
	public List<ComponenteEntity> getByNroPieza(@PathVariable("nroPieza") String nroPieza) {

		return componenteService.findByNroPieza(nroPieza);
	}

	// ---GET---
	@GetMapping("/categoria/{categoria}")
	public List<ComponenteEntity> getByCategoria(@PathVariable("nroPieza") String nroPieza) {

		return componenteService.findByNroPieza(nroPieza);
	}

	// ---GET---
	@GetMapping("/descripcion/{descripcion}")
	public List<ComponenteEntity> getByDescripcion(@PathVariable("descripcion") String descripcion) {

		return componenteService.findByDescripcion(descripcion);
	}

	// ---GET---
	@GetMapping("/fabricante/{fabricante}")
	public List<ComponenteEntity> getByFabricante(@PathVariable("fabricante") String fabricante) {

		return componenteService.findByFabricante(fabricante);
	}

	// ---GET---
	@GetMapping("/stock/{stock}")
	public List<ComponenteEntity> getByStock(@PathVariable("stock") int stock) {

		return componenteService.findByStock(stock);
	}

	// ---GET---
	@GetMapping("/precio/{precio}")
	public List<ComponenteEntity> getByPrecio(@PathVariable("precio") double precio) {

		return componenteService.findByPrecio(precio);
	}



}