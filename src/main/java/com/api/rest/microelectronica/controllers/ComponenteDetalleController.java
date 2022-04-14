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

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;
import com.api.rest.microelectronica.services.ComponenteDetalleService;


@RestController
@RequestMapping("/componentes-detalles")
public class ComponenteDetalleController {

	@Autowired
	private ComponenteDetalleService componenteDetalleService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.addComponente(componenteDetalle);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.updateComponente(componenteDetalle);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponenteDetalle(@PathVariable("id") int id) {

		return componenteDetalleService.deleteComponente(id);
	}

	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteDetalleEntity> getAll(Pageable pageable) {

		return componenteDetalleService.getAllComponente(pageable);
	}


	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/id/{id}")
	public ComponenteDetalleEntity getById(@PathVariable("id") int id) {

		return componenteDetalleService.findById(id);
	}

	// ---GET---
	@GetMapping("/id-componente/{id_componente}")
	public ComponenteDetalleEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteDetalleService.findByIdComponente(id_componente);
	}

	// ---GET---
	@GetMapping("/hoja-de-datos/{hojaDatos}")
	public List<ComponenteDetalleEntity> getByHojaDeDatos(@PathVariable("hojaDatos") String hojaDatos) {

		return componenteDetalleService.findByHojaDeDatos(hojaDatos);
	}

	// ---GET---
	@GetMapping("/longitud/{longitud}")
	public List<ComponenteDetalleEntity> getByLongitud(@PathVariable("longitud") String longitud) {

		return componenteDetalleService.findByLongitud(longitud);
	}
	
	
	// ---GET---
	@GetMapping("/ancho/{ancho}")
	public List<ComponenteDetalleEntity> getByAncho(@PathVariable("ancho") String ancho) {

		return componenteDetalleService.findByAncho(ancho);
	}
	
	// ---GET---
	@GetMapping("/peso/{peso}")
	public List<ComponenteDetalleEntity> getByPeso(@PathVariable("peso") String peso) {

		return componenteDetalleService.findByPeso(peso);
	}
	
	
	// ---GET---
	@GetMapping("/material/{material}")
	public List<ComponenteDetalleEntity> getByMaterial(@PathVariable("material") String material) {

		return componenteDetalleService.findByMaterial(material);
	}
	
	
	// ---GET---
	@GetMapping("/voltaje-recomendado/{voltajeRecomendado}")
	public List<ComponenteDetalleEntity> getByVoltajeRecomendado(@PathVariable("voltajeRecomendado") String voltajeRecomendado) {

		return componenteDetalleService.findByVoltajeRecomendado(voltajeRecomendado);
	}
	
	
	// ---GET---
	@GetMapping("/voltaje-min-entrada/{voltajeMinEntrada}")
	public List<ComponenteDetalleEntity> getByVoltajeMinEntrada(@PathVariable("voltajeMinEntrada") String voltajeMinEntrada) {

		return componenteDetalleService.findByVoltajeMinEntrada(voltajeMinEntrada);
	}
	
	// ---GET---
	@GetMapping("/voltaje-max-entrada/{voltajeMaxEntrada}")
	public List<ComponenteDetalleEntity> getByVoltajeMaxEntrada(@PathVariable("voltajeMaxEntrada") String voltajeMaxEntrada) {

		return componenteDetalleService.findByVoltajeMaxEntrada(voltajeMaxEntrada);
	}
	


	
}