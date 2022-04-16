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

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.api.rest.microelectronica.services.ComponenteTransistorBipolarService;


@RestController
@RequestMapping("/v1/componentes-transistores-bipolares")
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

		return componenteTransistorBipolarService.findById(id );
	}

	// ---GET---
	@GetMapping("/id-componente/{id_componente}")
	public ComponenteTransistorBipolarEntity getByIdComponente(@PathVariable("id_componente") int id_componente ) {

		return componenteTransistorBipolarService.findByIdComponente(id_componente);
	}

	// ---GET---
	@GetMapping("/tipo/{tipo}")
	public Page<ComponenteTransistorBipolarEntity> getByTipo(@PathVariable("tipo") String tipo ,  Pageable pageable ) {

		return componenteTransistorBipolarService.findByTipo(tipo , pageable);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-emis/{voltColecEmis}")
	public Page<ComponenteTransistorBipolarEntity> getByVoltajeColecEmis(
			@PathVariable("voltColecEmis") String voltajeColecEmis , Pageable pageable) {

		return componenteTransistorBipolarService.findByVoltajeColecEmis(voltajeColecEmis , pageable);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-base/{voltColecBase}")
	public Page<ComponenteTransistorBipolarEntity> getByVoltajeColecBase(
			@PathVariable("voltColecBase") String voltajeColecBase , Pageable pageable) {

		return componenteTransistorBipolarService.findByVoltajeColecBase(voltajeColecBase , pageable);
	}

	// ---GET---
	@GetMapping("/voltaje-emis-base/{voltEmisBase}")
	public Page<ComponenteTransistorBipolarEntity> getByVoltajeEmisBase(
			@PathVariable("voltColecEmis") String voltajeEmisBase , Pageable pageable) {

		return componenteTransistorBipolarService.findByVoltajeEmisBase(voltajeEmisBase , pageable);
	}

	// ---GET---
	@GetMapping("/voltaje-colec-emis-sat/{voltColecEmisSat}")
	public Page<ComponenteTransistorBipolarEntity> getByVoltajeColecEmisSat(
			@PathVariable("voltColecEmis") String voltajeColecEmisSat , Pageable pageable) {

		return componenteTransistorBipolarService.findByVoltajeColecEmisSat(voltajeColecEmisSat , pageable);
	}

	// ---GET---
	@GetMapping("/corriente-colec/{corColec}")
	public Page<ComponenteTransistorBipolarEntity> getByCorrienteColec(
			@PathVariable("corColec") String corrienteColec , Pageable pageable) {

		return componenteTransistorBipolarService.findByCorrienteColec(corrienteColec , pageable);
	}

	// ---GET---
	@GetMapping("/ganancia-hfe/{gananciaHfe}")
	public Page<ComponenteTransistorBipolarEntity> getByGananciaHfe(
			@PathVariable("gananciaHfe") String gananciaHfe , Pageable pageable) {

		return componenteTransistorBipolarService.findByGananciaHfe(gananciaHfe , pageable);
	}
	// ---GET---
	@GetMapping("/disip-max/{disipMax}")
	public Page<ComponenteTransistorBipolarEntity> getByDisipMax(
			@PathVariable("disipMax") String disipMax , Pageable pageable) {

		return componenteTransistorBipolarService.findByDisipMax(disipMax , pageable);
	}

	// ---GET---
	@GetMapping("/temp-juntura/{tempJuntura}")
	public Page<ComponenteTransistorBipolarEntity> getByTempJuntura(
			@PathVariable("tempJuntura") String tempJuntura , Pageable pageable) {

		return componenteTransistorBipolarService.findByTempJuntura(tempJuntura , pageable);
	}

	
}
