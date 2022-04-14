package com.api.rest.microelectronica.services;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.api.rest.microelectronica.repositories.I_ComponenteTransistorBipolarRepository;


@Service
public class ComponenteTransistorBipolarService {

	@Autowired
	private I_ComponenteTransistorBipolarRepository iComponenteTransistorBipolarRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteTransistorBipolarService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteTransistorBipolarEntity componenteTransistorBipolar) {
		try {
			if (componenteTransistorBipolar == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componenteTransistorBipolar + " ES NULO!!");
				return false;
			} else {
				iComponenteTransistorBipolarRepository.save(componenteTransistorBipolar);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componenteTransistorBipolar + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteTransistorBipolarEntity componenteTransistorBipolar) {
		try {
			if (componenteTransistorBipolar == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componenteTransistorBipolar + " ES NULO!!");
				return false;
			} else {
				iComponenteTransistorBipolarRepository.save(componenteTransistorBipolar);
				return true;
			}

		} catch (Exception e) {
			logger.error(
					"ERROR updateComponente : EL COMPONENTE " + componenteTransistorBipolar + " NO SE HA ACTUALIZADO EN LA DB!!");
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
				iComponenteTransistorBipolarRepository.delete(iComponenteTransistorBipolarRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ------ SELECT --------
	//------- LISTADO COMPLETO ---------
	public List<ComponenteTransistorBipolarEntity> getAllComponente() {

		return iComponenteTransistorBipolarRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteTransistorBipolarEntity> getAllComponente(Pageable pageable) {

		return iComponenteTransistorBipolarRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteTransistorBipolarEntity findById(int id) {
		return iComponenteTransistorBipolarRepository.findById(id);
	}

	// ------ ID DE COMPONENTE --------
	public ComponenteTransistorBipolarEntity findByIdComponente(int id) {
		return iComponenteTransistorBipolarRepository.findByIdComponente(id);
	}

	// ------ TIPO --------
	public List<ComponenteTransistorBipolarEntity> findByTipo(String tipo) {
		return iComponenteTransistorBipolarRepository.findByTipo(tipo);
	}

	// ------ VOLTAJE_COLEC_EMIS --------
	public List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmis(String voltajeColecEmis) {
		return iComponenteTransistorBipolarRepository.findByVoltajeColecEmis(voltajeColecEmis);
	}

	// ------ VOLTAJE_COLEC_BASE --------
	public List<ComponenteTransistorBipolarEntity> findByVoltajeColecBase(String voltajeColecBase) {
		return iComponenteTransistorBipolarRepository.findByVoltajeColecBase(voltajeColecBase);
	}

	// ------ VOLTAJE_EMIS_BASE --------
	public List<ComponenteTransistorBipolarEntity> findByVoltajeEmisBase(String voltajeEmisBase) {
		return iComponenteTransistorBipolarRepository.findByVoltajeEmisBase(voltajeEmisBase);
	}

	// ------ VOLTAJE_COLEC_EMIS_SAT --------
	public List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmisSat(String voltajeColecEmisSat) {
		return iComponenteTransistorBipolarRepository.findByVoltajeColecEmisSat(voltajeColecEmisSat);
	}

	// ------ CORRIENTE_COLEC --------
	public List<ComponenteTransistorBipolarEntity> findByCorrienteColec(String corriente_colec) {
		return iComponenteTransistorBipolarRepository.findByCorrienteColec(corriente_colec);
	}

	// ------ GANANCIA_HFE --------
	public List<ComponenteTransistorBipolarEntity> findByGananciaHfe(String gananciaHfe) {
		return iComponenteTransistorBipolarRepository.findByGananciaHfe(gananciaHfe);
	}

	// ------ DISIP_MAX --------
	public List<ComponenteTransistorBipolarEntity> findByDisipMax(String disipMax) {
		return iComponenteTransistorBipolarRepository.findByDisipMax(disipMax);
	}
	
	// ------ TEMP_JUNTURA --------
	public List<ComponenteTransistorBipolarEntity> findByTempJuntura(String tempJuntura) {
		return iComponenteTransistorBipolarRepository.findByTempJuntura(tempJuntura);
	}

	
}
