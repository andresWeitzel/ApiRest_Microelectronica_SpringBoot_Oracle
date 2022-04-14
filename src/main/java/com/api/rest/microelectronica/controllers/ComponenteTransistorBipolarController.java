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

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.api.rest.microelectronica.services.ComponenteTransistorBipolarService;


@RestController
@RequestMapping("/componentes-transistores-bipolares")
public class ComponenteTransistorBipolarController {

	@Autowired
	private ComponenteTransistorBipolarService componenteTransistorBipolarService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponenteDetalle(@RequestBody ComponenteTransistorBipolarEntity componenteTransistorBipolar) {

		return componenteTransistorBipolarService.addComponente(componenteTransistorBipolar);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponenteDetalle(@RequestBody ComponenteTransistorBipolarEntity componenteTransistorBipolar) {

		return componenteTransistorBipolarService.updateComponente(componenteTransistorBipolar);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponenteDetalle(@PathVariable("id") int id) {

		return componenteTransistorBipolarService.deleteComponente(id);
	}

	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteTransistorBipolarEntity> getAll(Pageable pageable) {

		return componenteTransistorBipolarService.getAllComponente(pageable);
	}

	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/id/{id}")
	public ComponenteTransistorBipolarEntity getById(@PathVariable("id") int id) {

		return componenteTransistorBipolarService.findById(id);
	}

	// ---GET---
	@GetMapping("/id-componente/{id_componente}")
	public ComponenteTransistorBipolarEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteTransistorBipolarService.findByIdComponente(id_componente);
	}

	// ---GET---
	@GetMapping("/tipo/{tipo}")
	public List<ComponenteTransistorBipolarEntity> getByTipo(@PathVariable("tipo") String tipo) {

		return componenteTransistorBipolarService.findByTipo(tipo);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-emis/{voltColecEmis}")
	public List<ComponenteTransistorBipolarEntity> getByVoltajeColecEmis(
			@PathVariable("voltColecEmis") String voltajeColecEmis) {

		return componenteTransistorBipolarService.findByVoltajeColecEmis(voltajeColecEmis);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-base/{voltColecBase}")
	public List<ComponenteTransistorBipolarEntity> getByVoltajeColecBase(
			@PathVariable("voltColecBase") String voltajeColecBase) {

		return componenteTransistorBipolarService.findByVoltajeColecBase(voltajeColecBase);
	}

	// ---GET---
	@GetMapping("/voltaje-emis-base/{voltEmisBase}")
	public List<ComponenteTransistorBipolarEntity> getByVoltajeEmisBase(
			@PathVariable("voltColecEmis") String voltajeEmisBase) {

		return componenteTransistorBipolarService.findByVoltajeEmisBase(voltajeEmisBase);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-emis-sat/{voltColecEmisSat}")
	public List<ComponenteTransistorBipolarEntity> getByVoltajeColecEmisSat(
			@PathVariable("voltColecEmis") String voltajeColecEmisSat) {

		return componenteTransistorBipolarService.findByVoltajeColecEmisSat(voltajeColecEmisSat);
	}

	// ---GET---
	@GetMapping("/corriente-colec/{corColec}")
	public List<ComponenteTransistorBipolarEntity> getByCorrienteColec(
			@PathVariable("corColec") String corrienteColec) {

		return componenteTransistorBipolarService.findByCorrienteColec(corrienteColec);
	}

	// ---GET---
	@GetMapping("/ganancia-hfe/{gananciaHfe}")
	public List<ComponenteTransistorBipolarEntity> getByGananciaHfe(
			@PathVariable("gananciaHfe") String gananciaHfe) {

		return componenteTransistorBipolarService.findByGananciaHfe(gananciaHfe);
	}
	// ---GET---
	@GetMapping("/disip-max/{disipMax}")
	public List<ComponenteTransistorBipolarEntity> getByDisipMax(
			@PathVariable("disipMax") String disipMax) {

		return componenteTransistorBipolarService.findByDisipMax(disipMax);
	}

	// ---GET---
	@GetMapping("/temp-juntura/{tempJuntura}")
	public List<ComponenteTransistorBipolarEntity> getByTempJuntura(
			@PathVariable("tempJuntura") String tempJuntura) {

		return componenteTransistorBipolarService.findByTempJuntura(tempJuntura);
	}

	
}
