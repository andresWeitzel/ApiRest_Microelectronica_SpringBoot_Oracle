package com.api.rest.microelectronica.services;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;
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
	public boolean addComponente(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componenteDetalle + " ES NULO!!");
				return false;
			} else {
				iComponenteDetalleRepository.save(componenteDetalle);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componenteDetalle + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ==================
	// ===== UPDATE =====
	// ==================
	public boolean updateComponente(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componenteDetalle + " ES NULO!!");
				return false;
			} else {
				iComponenteDetalleRepository.save(componenteDetalle);
				return true;
			}

		} catch (Exception e) {
			logger.error(
					"ERROR updateComponente : EL COMPONENTE " + componenteDetalle + " NO SE HA ACTUALIZADO EN LA DB!!");
			return false;
		}
	}

	// ==================
	// ===== DELETE =====
	// ==================
	public boolean deleteComponente(int id) {
		try {
			if (id <= 0) {
				logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO EXISTE!!");
				return false;
			} else {
				iComponenteDetalleRepository.delete(iComponenteDetalleRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ===================
	// ===== GET ALL =====
	// ===================

	// ------- LISTADO PAGINADO ---------
	public Page<ComponenteDetalleEntity> getAllComponente(Pageable pageable) {

		return iComponenteDetalleRepository.findAll(pageable);
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID --------
	public ComponenteDetalleEntity findById(int id) {
		return iComponenteDetalleRepository.findById(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID DE COMPONENTE --------
	public ComponenteDetalleEntity findByIdComponente(int id) {
		return iComponenteDetalleRepository.findByIdComponente(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ HOJA DE DATOS --------
	public Page<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos, Pageable pageable) {
		return iComponenteDetalleRepository.findByHojaDeDatos(hojaDeDatos, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ LONGITUD --------
	public Page<ComponenteDetalleEntity> findByLongitud(String longitud, Pageable pageable) {
		return iComponenteDetalleRepository.findByLongitud(longitud, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ ANCHO --------
	public Page<ComponenteDetalleEntity> findByAncho(String ancho, Pageable pageable) {
		return iComponenteDetalleRepository.findByAncho(ancho, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ PESO --------
	public Page<ComponenteDetalleEntity> findByPeso(String peso, Pageable pageable) {
		return iComponenteDetalleRepository.findByPeso(peso, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ MATERIAL --------
	public Page<ComponenteDetalleEntity> findByMaterial(String material, Pageable pageable) {
		return iComponenteDetalleRepository.findByMaterial(material, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE RECOMENDADO --------
	public Page<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado, Pageable pageable) {
		return iComponenteDetalleRepository.findByVoltajeRecomendado(voltajeRecomendado, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE MINIMO DE ENTRADA --------
	public Page<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada, Pageable pageable) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMinEntrada, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ VOLTAJE MAXIMO DE ENTRADA --------
	public Page<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada, Pageable pageable) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMaxEntrada, pageable);
	}

}
