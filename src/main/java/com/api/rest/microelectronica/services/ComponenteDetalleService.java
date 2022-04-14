package com.api.rest.microelectronica.services;

import java.util.List;

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

	// ------ INSERT --------
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

	// ------ UPDATE --------
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

	// ------ DELETE --------
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

	// ------ SELECT --------
	//------- LISTADO COMPLETO ---------
	public List<ComponenteDetalleEntity> getAllComponente() {

		return iComponenteDetalleRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteDetalleEntity> getAllComponente(Pageable pageable) {

		return iComponenteDetalleRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteDetalleEntity findById(int id) {
		return iComponenteDetalleRepository.findById(id);
	}

	// ------ ID DE COMPONENTE --------
	public ComponenteDetalleEntity findByIdComponente(int id) {
		return iComponenteDetalleRepository.findByIdComponente(id);
	}

	// ------ HOJA DE DATOS --------
	public List<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos) {
		return iComponenteDetalleRepository.findByHojaDeDatos(hojaDeDatos);
	}

	// ------ LONGITUD --------
	public List<ComponenteDetalleEntity> findByLongitud(String longitud) {
		return iComponenteDetalleRepository.findByLongitud(longitud);
	}

	// ------ ANCHO --------
	public List<ComponenteDetalleEntity> findByAncho(String ancho) {
		return iComponenteDetalleRepository.findByAncho(ancho);
	}

	// ------ PESO --------
	public List<ComponenteDetalleEntity> findByPeso(String peso) {
		return iComponenteDetalleRepository.findByPeso(peso);
	}

	// ------ MATERIAL --------
	public List<ComponenteDetalleEntity> findByMaterial(String material) {
		return iComponenteDetalleRepository.findByMaterial(material);
	}

	// ------ VOLTAJE RECOMENDADO --------
	public List<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado) {
		return iComponenteDetalleRepository.findByVoltajeRecomendado(voltajeRecomendado);
	}

	// ------ VOLTAJE MINIMO DE ENTRADA --------
	public List<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMinEntrada);
	}

	// ------ VOLTAJE MAXIMO DE ENTRADA --------
	public List<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMaxEntrada);
	}

}
