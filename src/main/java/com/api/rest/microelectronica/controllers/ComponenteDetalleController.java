package com.api.rest.microelectronica.controllers;



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

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;
import com.api.rest.microelectronica.services.ComponenteDetalleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/v1/componentes-detalles")
public class ComponenteDetalleController {

	@Autowired
	private ComponenteDetalleService componenteDetalleService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ================
	// ===== POST =====
	// ================
	@Operation(summary = "Inserción del Detalle de un Componente ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Insertado el Detalle del Componente Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo Insertar el Detalle del Componente. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "La Inserción del Detalle del Componente no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@PostMapping("/")
	public void addComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		componenteDetalleService.addComponenteDetalle(componenteDetalle);
	}

	// ===============
	// ===== PUT =====
	// ===============
	@Operation(summary = "Actualización del Detalle de un Componente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Actualizado el Detalle del Componente Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo Actualizar el Detalle del Componente. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "La Actualización del Detalle del Componente no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@PutMapping("/")
	public void updateComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		componenteDetalleService.updateComponenteDetalle(componenteDetalle);
	}

	// ==================
	// ===== DELETE =====
	// ==================
	@Operation(summary = "Eliminación del Detalle de un Componente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Eliminado el Detalle del Componente Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo Eliminar el Detalle del Componente. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "La Eliminación del Detalle del Componente no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@DeleteMapping("/{id}")
	public void deleteComponenteDetalle(@PathVariable("id") int id) {

		componenteDetalleService.deleteComponenteDetalle(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// --- LISTADO PAGINADO Y COMPLETO ---
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/listado")
	public Page<ComponenteDetalleEntity> getAll(Pageable pageable) {

		return componenteDetalleService.getAllComponenteDetalle(pageable);
	}


	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/id/{id}")
	public ComponenteDetalleEntity getById(@PathVariable("id") int id) {

		return componenteDetalleService.findById(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por el ID del Componente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/id-componente/{id_componente}")
	public ComponenteDetalleEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteDetalleService.findByIdComponente(id_componente);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Hoja de Datos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/hoja-de-datos/{hojaDatos}")
	public Page<ComponenteDetalleEntity> getByHojaDeDatos(@PathVariable("hojaDatos") String hojaDatos , Pageable pageable) {

		return componenteDetalleService.findByHojaDeDatos(hojaDatos , pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Longitud")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/longitud/{longitud}")
	public Page<ComponenteDetalleEntity> getByLongitud(@PathVariable("longitud") String longitud , Pageable pageable) {

		return componenteDetalleService.findByLongitud(longitud, pageable);
	}
	
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Ancho")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/ancho/{ancho}")
	public Page<ComponenteDetalleEntity> getByAncho(@PathVariable("ancho") String ancho , Pageable pageable) {

		return componenteDetalleService.findByAncho(ancho, pageable);
	}
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Peso")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/peso/{peso}")
	public Page<ComponenteDetalleEntity> getByPeso(@PathVariable("peso") String peso , Pageable pageable) {

		return componenteDetalleService.findByPeso(peso, pageable);
	}
	
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Material")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/material/{material}")
	public Page<ComponenteDetalleEntity> getByMaterial(@PathVariable("material") String material , Pageable pageable) {

		return componenteDetalleService.findByMaterial(material, pageable);
	}
	
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Voltaje Recomendado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/voltaje-recomendado/{voltajeRecomendado}")
	public Page<ComponenteDetalleEntity> getByVoltajeRecomendado(@PathVariable("voltajeRecomendado") String voltajeRecomendado , Pageable pageable) {

		return componenteDetalleService.findByVoltajeRecomendado(voltajeRecomendado, pageable);
	}
	
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Voltaje Mínimo de Entrada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/voltaje-min-entrada/{voltajeMinEntrada}")
	public Page<ComponenteDetalleEntity> getByVoltajeMinEntrada(@PathVariable("voltajeMinEntrada") String voltajeMinEntrada , Pageable pageable) {

		return componenteDetalleService.findByVoltajeMinEntrada(voltajeMinEntrada, pageable);
	}
	
	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Listado Paginado de los Detalles de los Componentes por su Voltaje Máximo de Entrada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha Traído el Listado de los Detalles de los Componentes Correctamente",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400",
            description = "No se pudo traer el Listado de los Detalles de los Componentes. Comprobar la Solicitud",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "El Listado de los Detalles de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud",
            content = @Content),
            @ApiResponse(responseCode = "500",
            description = "Se ha producido un error interno en el Servidor",
            content = @Content)
    })
	@GetMapping("/voltaje-max-entrada/{voltajeMaxEntrada}")
	public Page<ComponenteDetalleEntity> getByVoltajeMaxEntrada(@PathVariable("voltajeMaxEntrada") String voltajeMaxEntrada , Pageable pageable) {

		return componenteDetalleService.findByVoltajeMaxEntrada(voltajeMaxEntrada, pageable);
	}
	


	
}