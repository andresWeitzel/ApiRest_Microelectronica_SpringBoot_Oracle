package com.api.rest.microelectronica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/v1/componentes")
@CrossOrigin(origins = "*")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	// ===============================================
	// ============= MÉTODOS HTTP CRUD ==============
	// ===============================================

	// ================
	// ===== POST =====
	// =================
	@Operation(summary = "Inserción de un Componente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Insertado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Insertado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Insertar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para Insertar el Componente. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido insertar el componente. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Inserción del Componente no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@PostMapping("/")
	public void addComponente(@RequestBody ComponenteEntity componente) {

		componenteService.addComponente(componente);
	}

	// ================
	// ===== PUT=====
	// =================
	@Operation(summary = "Actualización de un Componente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Actualizado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Actualizado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Actualizar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para Actualizar el Componente. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido Actualizar el componente. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Actualización del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@PutMapping("/")
	public void updateComponente(@RequestBody ComponenteEntity componente) {

		componenteService.updateComponente(componente);
	}

	// ==================
	// ===== DELETE =====
	// ==================
	@Operation(summary = "Eliminación de un Componente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Eliminado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Eliminado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Eliminado el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para Eliminar el Componente. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido Eliminado el componente. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Eliminación del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@DeleteMapping("/{id}")
	public void deleteComponente(@PathVariable("id") int id) {

		componenteService.deleteComponente(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ---LISTADO PAGINADO Y COMPLETO---
	@Operation(summary = "Listado Paginado de Componentes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Listado de Componentes", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Traído el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido encontrar el listado de componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "El Listado de Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/listado")
	public Page<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}
	
	// ===============
	// ===== GET =====
	// ===============
	// ---LISTADO PAGINADO Y COMPLETO CON FILTRO---
	@Operation(summary = "Listado Paginado de Componentes con Filtro")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Listado de Componentes con Filtro", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Traído el Componente con Filtro Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes con Filtro. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes con Filtro. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido encontrar el listado de componentes con Filtro. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "El Listado de Componentes con Filtro no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/listado-filtro")
	public Page<ComponenteEntity> getAllFilter(String filter, Pageable pageable) {

		return componenteService.getAllFilterComponente(filter, pageable);
	}

	// ==================================================
	// ============= MÉTODOS HTTP BÚSQUEDA =============
	// ==================================================

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda de un Componente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se ha Traído el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se ha podido encontrar el componente. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/id/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Código")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/codigo/{codigo}")
	public Page<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo, Pageable pageable) {

		return componenteService.findByCodigo(codigo, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Imagen")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/imagen/{imagen}")
	public Page<ComponenteEntity> getByImagen(@PathVariable("imagen") String imagen, Pageable pageable) {

		return componenteService.findByImagen(imagen, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Número de Piezas")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/nro-de-pieza/{nroPieza}")
	public Page<ComponenteEntity> getByNroPieza(@PathVariable("nroPieza") String nroPieza, Pageable pageable) {

		return componenteService.findByNroPieza(nroPieza, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Categoría")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/categoria/{categoria}")
	public Page<ComponenteEntity> getByCategoria(@PathVariable("categoria") String categoria, Pageable pageable) {

		return componenteService.findByCategoria(categoria, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Descripción")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/descripcion/{descripcion}")
	public Page<ComponenteEntity> getByDescripcion(@PathVariable("descripcion") String descripcion, Pageable pageable) {

		return componenteService.findByDescripcion(descripcion, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Fabricante")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/fabricante/{fabricante}")
	public Page<ComponenteEntity> getByFabricante(@PathVariable("fabricante") String fabricante, Pageable pageable) {

		return componenteService.findByFabricante(fabricante, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Stock")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/stock/{stock}")
	public Page<ComponenteEntity> getByStock(@PathVariable("stock") int stock, Pageable pageable) {

		return componenteService.findByStock(stock, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Precio")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "201", description = "Se han Traído los Componenten Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "401", description = "No está autorizado para solicitar el Listado de Componentes. Verificar Credenciales", content = @Content),
			@ApiResponse(responseCode = "403", description = "No se han podido encontrar los Componentes. El servidor ha denegado esta operación", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/precio/{precio}")
	public Page<ComponenteEntity> getByPrecio(@PathVariable("precio") double precio, Pageable pageable) {

		return componenteService.findByPrecio(precio, pageable);
	}

}