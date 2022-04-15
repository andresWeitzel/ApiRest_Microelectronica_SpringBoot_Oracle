package com.api.rest.microelectronica.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteEntity;
import com.api.rest.microelectronica.exceptions.componentes.ComponenteIdMismatchException;
import com.api.rest.microelectronica.exceptions.componentes.ComponenteNotFoundException;
import com.api.rest.microelectronica.repositories.I_ComponenteRepository;

@Service
public class ComponenteService {

	@Autowired
	private I_ComponenteRepository iComponenteRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteService.class);

	// =============== MÉTODOS CRUD ====================

	// ==================
	// ===== INSERT =====
	// ==================
	public void addComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componente + " ES NULO!!");
				throw new ComponenteNotFoundException("EL COMPONENTE ES NULO");
			} else {
				iComponenteRepository.save(componente);
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componente + " NO SE HA INSERTADO EN LA DB!!");
			throw new ComponenteNotFoundException("NO SE PUDO AGREGAR EL COMPONENTE ", e, true, true);
		}
	}

	// ==================
	// ===== UPDATE =====
	// ==================
	public void updateComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {

				logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " ES NULO!!");

				throw new ComponenteNotFoundException("EL COMPONENTE ES NULO");

			} else {
				iComponenteRepository.save(componente);

			}

		} catch (Exception e) {
			logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " NO SE HA ACTUALIZADO EN LA DB!!");
			throw new ComponenteNotFoundException("NO SE PUDO ACTUALIZAR EL COMPONENTE ", e, true, true);
		}
	}

	// ==================
	// ===== DELETE =====
	// ==================
	public void deleteComponente(int id) {
		try {
			if (id <= 0 || iComponenteRepository.findById(id).getId() != id) {

				logger.error("ERROR deleteComponente : EL COMPONENTE CON EL ID " + id + " NO EXISTE!!");

				throw new ComponenteIdMismatchException("EL ID NO EXISTE EN LA DB");

			} else {

				iComponenteRepository.delete(iComponenteRepository.findById(id));

				logger.info("SE HA ELIMINADO CORRECTAMENTE EL COMPONENTE CON EL ID " + id);

			}

		} catch (Exception e) {

			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL ID " + id
					+ " NO SE HA ELIMINADO DE LA DB!! . CAUSADO POR " + e);

			throw new ComponenteNotFoundException("NO SE PUDO ELIMINAR EL COMPONENTE ", e, true, true);

		}
	}

	// ===================
	// ===== GET ALL =====
	// ===================
	// ------- LISTADO PAGINADO ---------
	public Page<ComponenteEntity> getAllComponente(Pageable pageable) {

		try {
			return iComponenteRepository.findAll(pageable);
		} catch (Exception e) {
			
			logger.error("ERROR getAllComponente : NO SE HAN LISTADO LOS COMPONENTES. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES ", e);
		} 
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID --------
	public ComponenteEntity findById(int id) {
		try {
			
			if (id <= 0 || iComponenteRepository.findById(id).getId() != id) {

				logger.error("ERROR finById : EL COMPONENTE CON EL ID " + id + " NO EXISTE!!");

				throw new ComponenteIdMismatchException("EL ID DEL COMPONENTE NO EXISTE EN LA DB");

			} else {

			
				logger.info("SE HA ELIMINADO CORRECTAMENTE EL COMPONENTE CON EL ID " + id);
				
				return iComponenteRepository.findById(id);


			}
			
			
		} catch (Exception e) {
			logger.error("ERROR findById : NO SE HA ENCONTRADO EL COMPONENTE CON EL ID SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL COMPONENTE CON EL ID SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ CODIGO --------
	public Page<ComponenteEntity> findByCodigo(String codigo, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByCodigo(codigo, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByCodigo : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL CODIGO SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL CODIGO SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ IMAGEN --------
	public Page<ComponenteEntity> findByImagen(String imagen, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByImagen(imagen, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByImagen : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON LA IMAGEN SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON LA IMAGEN SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ NRO_PIEZA --------
	public Page<ComponenteEntity> findByNroPieza(String nroPieza, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByNroPieza(nroPieza, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByNroPieza : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL NRO DE PIEZA SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL NRO DE PIEZA SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ CATEGORIA --------
	public Page<ComponenteEntity> findByCategoria(String categoria, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByCategoria(categoria, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByCategoria : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON LA CATEGORIA SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON LA CATEGORIA SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ DESCRIPCION --------
	public Page<ComponenteEntity> findByDescripcion(String descripcion, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByDescripcion(descripcion, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByDescripcion : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON LA DESCRIPCION SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON LA DESCRIPCION SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ FABRICANTE --------
	public Page<ComponenteEntity> findByFabricante(String fabricante, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByFabricante(fabricante, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByFabricante : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL FABRICANTE SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL FABRICANTE SOLICITADO ", e);
		
		}

	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ STOCK --------
	public Page<ComponenteEntity> findByStock(int cantidad, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByStock(cantidad, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByStock : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL STOCK SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL STOCK SOLICITADO ", e);
		}
		
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ PRECIO --------
	public Page<ComponenteEntity> findByPrecio(double precio, Pageable pageable) {
		
		try {
			return iComponenteRepository.findByPrecio(precio, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByPrecio : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL PRECIO SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL PRECIO SOLICITADO ", e);
		}
		
	}

	// =============== MÉTODOS PARA GRAFICO ====================

	// ===============
	// ===== GET =====
	// ===============
	// ------ STOCK POR CATEGORIA ------
	public int stockPorCategoria(List<ComponenteEntity> listComp, String categoria) {

		try {
			return (int) (listComp.stream().filter(comp -> comp.getCategoria().equalsIgnoreCase(categoria))
					.mapToInt(comp -> comp.getStock()).sum());	
		} catch (Exception e) {
		    logger.error("ERROR stockPorCategoria : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL STOCK POR CATEGORIA SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL STOCK POR CATEGORIA SOLICITADO ", e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ STOCK POR FABRICANTE ------
	public int stockPorFabricante(List<ComponenteEntity> listComp, String fabricante) {

		try {
			return (int) (listComp.stream().filter(comp -> comp.getFabricante().equalsIgnoreCase(fabricante))
					.mapToInt(comp -> comp.getStock()).sum());
		} catch (Exception e) {
			 logger.error("ERROR stockPorFabricante : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL STOCK POR FABRICANTE SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL STOCK POR FABRICANTE SOLICITADO ", e);
		}
		
	}

}