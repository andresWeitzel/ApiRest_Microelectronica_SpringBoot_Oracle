package com.api.rest.microelectronica.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;
import com.api.rest.microelectronica.exceptions.componentes.detalles.ComponenteDetalleIdMismatchException;
import com.api.rest.microelectronica.exceptions.componentes.detalles.ComponenteDetalleNotFoundException;
import com.api.rest.microelectronica.repositories.I_ComponenteDetalleRepository;

@Service
public class ComponenteDetalleService {

	@Autowired
	private I_ComponenteDetalleRepository iComponenteDetalleRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteService.class);

	// =============== MÉTODOS CRUD ====================

	// ==================
	// ===== INSERT =====
	// ==================
	public void addComponenteDetalle(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {
				logger.error(
						"ERROR addComponenteDetalle : EL DETALLE DEL COMPONENTE " + componenteDetalle + " ES NULO!!");
				throw new ComponenteDetalleNotFoundException("EL DETALLE DEL COMPONENTE ES NULO");
			} else {
				iComponenteDetalleRepository.save(componenteDetalle);
			}

		} catch (Exception e) {
			logger.error("ERROR addComponenteDetalle : EL DETALLE DEL COMPONENTE " + componenteDetalle
					+ " NO SE HA INSERTADO EN LA DB!!");
			throw new ComponenteDetalleNotFoundException("NO SE PUDO AGREGAR EL DETALLE DEL COMPONENTE ", e, false,
					true);
		}
	}

	// ==================
	// ===== UPDATE =====
	// ==================
	public void updateComponenteDetalle(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {

				logger.error("ERROR updateComponenteDetalle : EL DETALLE DEL COMPONENTE " + componenteDetalle
						+ " ES NULO!!");

				throw new ComponenteDetalleNotFoundException("EL DETALLE DEL COMPONENTE ES NULO");

			} else {
				iComponenteDetalleRepository.save(componenteDetalle);

			}

		} catch (Exception e) {
			logger.error("ERROR updateDetalleComponente : EL DETALLE DEL COMPONENTE " + componenteDetalle
					+ " NO SE HA ACTUALIZADO EN LA DB!!");
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ACTUALIZAR EL DETALLE DEL COMPONENTE ", e, false,
					true);
		}
	}

	// ==================
	// ===== DELETE =====
	// ==================
	public void deleteComponenteDetalle(int id) {
		try {
			if (id <= 0 || iComponenteDetalleRepository.findById(id).getId() != id) {

				logger.error(
						"ERROR deleteDetalleComponente : EL DETALLE DEL COMPONENTE CON EL ID " + id + " NO EXISTE!!");

				throw new ComponenteDetalleIdMismatchException("EL ID NO EXISTE EN LA DB");

			} else {

				iComponenteDetalleRepository.delete(iComponenteDetalleRepository.findById(id));

				logger.info("SE HA ELIMINADO CORRECTAMENTE EL COMPONENTE CON EL ID " + id);

			}

		} catch (Exception e) {

			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL ID " + id
					+ " NO SE HA ELIMINADO DE LA DB!! . CAUSADO POR " + e);

			throw new ComponenteDetalleNotFoundException("NO SE PUDO ELIMINAR EL COMPONENTE ", e, false, true);

		}
	}

	// ===================
	// ===== GET ALL =====
	// ===================

	// ------- LISTADO PAGINADO ---------
	public Page<ComponenteDetalleEntity> getAllComponenteDetalle(Pageable pageable) {

		try {
			return iComponenteDetalleRepository.findAll(pageable);
		} catch (Exception e) {

			logger.error(
					"ERROR getAllComponenteDetalle : NO SE HAN LISTADO LOS DETALLES DE LOS COMPONENTES. CAUSADO POR "
							+ e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE DETALLES DE COMPONENTES ",
					e);
		}
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID --------
	public ComponenteDetalleEntity findById(int id) {
		try {

			if (id <= 0 || iComponenteDetalleRepository.findById(id).getId() != id) {

				logger.error("ERROR finById : EL DETALLE DEL COMPONENTE CON EL ID " + id + " NO EXISTE!!");

				throw new ComponenteDetalleIdMismatchException("EL ID DEL DETALLE DEL COMPONENTE NO EXISTE EN LA DB");

			} else {

				logger.info("SE HA ELIMINADO CORRECTAMENTE EL DETALLE DEL COMPONENTE CON EL ID " + id);

				return iComponenteDetalleRepository.findById(id);

			}

		} catch (Exception e) {
			logger.error("ERROR findById : NO SE HA ENCONTRADO EL DETALLE DEL COMPONENTE CON EL ID SOLICITADO. CAUSADO POR " + e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL DETALLE DEL COMPONENTE CON EL ID SOLICITADO ", e);
		}

	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID DE COMPONENTE --------
	public ComponenteDetalleEntity findByIdComponente(int id) {
		try {

			if (id <= 0 || iComponenteDetalleRepository.findById(id).getId() != id) {

				logger.error("ERROR finByIdComponente : EL DETALLE DEL COMPONENTE CON EL ID DEL COMPONENTE " + id + " NO EXISTE!!");

				throw new ComponenteDetalleIdMismatchException("EL ID DEL COMPONENTE NO EXISTE EN LA DB");

			} else {

				logger.info("SE HA ELIMINADO CORRECTAMENTE EL DETALLE DEL COMPONENTE CON EL ID DEL COMPONENTE" + id);

				return iComponenteDetalleRepository.findById(id);

			}

		} catch (Exception e) {
			logger.error("ERROR findByIdComponente:  NO SE HA ENCONTRADO EL DETALLE DEL COMPONENTE CON EL ID DEL COMPONENTE SOLICITADO. CAUSADO POR " + e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL DETALLE DEL COMPONENTE CON EL ID DEL COMPONENTE SOLICITADO ", e);
		}
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ HOJA DE DATOS --------
	public Page<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos, Pageable pageable) {
		try {
			return iComponenteDetalleRepository.findByHojaDeDatos(hojaDeDatos, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByHojaDeDatos : NO SE HA ENCONTRADO EL LISTADO DEL DETALLE DE COMPONENTES CON EL LA HOJA DE DATOS SOLICITADA. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON LA HOJA DE DATOS SOLICITADA ", e);
		}
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ LONGITUD --------
	public Page<ComponenteDetalleEntity> findByLongitud(String longitud, Pageable pageable) {
		try {
			return iComponenteDetalleRepository.findByLongitud(longitud, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByLongitud : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON LA LONGITUD SOLICITADA. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON LA LONGITUD SOLICITADA "+e);
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ ANCHO --------
	public Page<ComponenteDetalleEntity> findByAncho(String ancho, Pageable pageable) {
		
		try {
			return iComponenteDetalleRepository.findByAncho(ancho, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByAncho : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL ANCHO SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL ANCHO SOLICITADO "+e);
		
		}
		
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ PESO --------
	public Page<ComponenteDetalleEntity> findByPeso(String peso, Pageable pageable) {
		
		try {
			return iComponenteDetalleRepository.findByPeso(peso, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByPeso : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL PESO SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL PESO SOLICITADO "+e);
		 
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ MATERIAL --------
	public Page<ComponenteDetalleEntity> findByMaterial(String material, Pageable pageable) {
	
		try {
			return iComponenteDetalleRepository.findByMaterial(material, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByMaterial : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL MATERIAL SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL MATERIAL SOLICITADO "+e);
		 
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE RECOMENDADO --------
	public Page<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado, Pageable pageable) {
		
		try {
			return iComponenteDetalleRepository.findByVoltajeRecomendado(voltajeRecomendado, pageable);	
		} catch (Exception e) {
		    logger.error("ERROR findByVoltajeRecomendado : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL VOLTAJE RECOMENDADO SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL VOLTAJE RECOMENDADO SOLICITADO "+e);
			 
		}
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE MINIMO DE ENTRADA --------
	public Page<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada, Pageable pageable) {
		try {
			return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMinEntrada, pageable);	
		} catch (Exception e) {
			logger.error("ERROR findByVoltajeMinEntrada : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL VOLTAJE MINIMO DE ENTRADA SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL VOLTAJE MINIMO DE ENTRADA SOLICITADO "+e);
			 
		}
		
		
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE MAXIMO DE ENTRADA --------
	public Page<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada, Pageable pageable) {
		
		try {
			return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMaxEntrada, pageable);
		} catch (Exception e) {
			logger.error("ERROR findByVoltajeMaxEntrada : NO SE HA ENCONTRADO EL LISTADO DE COMPONENTES CON EL VOLTAJE MAXIMO DE ENTRADA SOLICITADO. CAUSADO POR "+e);
			throw new ComponenteDetalleNotFoundException("NO SE PUDO ENCONTRAR EL LISTADO DE COMPONENTES CON EL VOLTAJE MAXIMO DE ENTRADA SOLICITADO "+e);
			 
		}
		
	}

}
