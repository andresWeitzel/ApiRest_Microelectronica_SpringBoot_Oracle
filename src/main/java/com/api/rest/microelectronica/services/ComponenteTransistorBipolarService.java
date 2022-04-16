package com.api.rest.microelectronica.services;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.api.rest.microelectronica.repositories.I_ComponenteTransistorBipolarRepository;


@Service
public class ComponenteTransistorBipolarService {

	@Autowired
	private I_ComponenteTransistorBipolarRepository iTransistorBipolarRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteTransistorBipolarService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteTransistorBipolarEntity TransistorBipolar) {
		try {
			if (TransistorBipolar == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + TransistorBipolar + " ES NULO!!");
				return false;
			} else {
				iTransistorBipolarRepository.save(TransistorBipolar);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + TransistorBipolar + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteTransistorBipolarEntity TransistorBipolar) {
		try {
			if (TransistorBipolar == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + TransistorBipolar + " ES NULO!!");
				return false;
			} else {
				iTransistorBipolarRepository.save(TransistorBipolar);
				return true;
			}

		} catch (Exception e) {
			logger.error(
					"ERROR updateComponente : EL COMPONENTE " + TransistorBipolar + " NO SE HA ACTUALIZADO EN LA DB!!");
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
				iTransistorBipolarRepository.delete(iTransistorBipolarRepository.findById(id));
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

		return iTransistorBipolarRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteTransistorBipolarEntity> getAllComponente(Pageable pageable) {

		return iTransistorBipolarRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteTransistorBipolarEntity findById(int id ) {
		return iTransistorBipolarRepository.findById(id);
	}

	// ------ ID DE COMPONENTE --------
	public ComponenteTransistorBipolarEntity findByIdComponente(int id ) {
		return iTransistorBipolarRepository.findByIdComponente(id);
	}

	// ------ TIPO --------
	public Page<ComponenteTransistorBipolarEntity> findByTipo(String tipo , Pageable pageable) {
		return iTransistorBipolarRepository.findByTipo(tipo , pageable);
	}

	// ------ VOLTAJE_COLEC_EMIS --------
	public Page<ComponenteTransistorBipolarEntity> findByVoltajeColecEmis(String voltajeColecEmis , Pageable pageable) {
		return iTransistorBipolarRepository.findByVoltajeColecEmis(voltajeColecEmis , pageable);
	}

	// ------ VOLTAJE_COLEC_BASE --------
	public Page<ComponenteTransistorBipolarEntity> findByVoltajeColecBase(String voltajeColecBase , Pageable pageable) {
		return iTransistorBipolarRepository.findByVoltajeColecBase(voltajeColecBase , pageable);
	}

	// ------ VOLTAJE_EMIS_BASE --------
	public Page<ComponenteTransistorBipolarEntity> findByVoltajeEmisBase(String voltajeEmisBase , Pageable pageable) {
		return iTransistorBipolarRepository.findByVoltajeEmisBase(voltajeEmisBase , pageable);
	}

	// ------ VOLTAJE_COLEC_EMIS_SAT --------
	public Page<ComponenteTransistorBipolarEntity> findByVoltajeColecEmisSat(String voltajeColecEmisSat , Pageable pageable) {
		return iTransistorBipolarRepository.findByVoltajeColecEmisSat(voltajeColecEmisSat , pageable);
	}

	// ------ CORRIENTE_COLEC --------
	public Page<ComponenteTransistorBipolarEntity> findByCorrienteColec(String corriente_colec , Pageable pageable) {
		return iTransistorBipolarRepository.findByCorrienteColec(corriente_colec , pageable);
	}

	// ------ GANANCIA_HFE --------
	public Page<ComponenteTransistorBipolarEntity> findByGananciaHfe(String gananciaHfe , Pageable pageable) {
		return iTransistorBipolarRepository.findByGananciaHfe(gananciaHfe , pageable);
	}

	// ------ DISIP_MAX --------
	public Page<ComponenteTransistorBipolarEntity> findByDisipMax(String disipMax , Pageable pageable) {
		return iTransistorBipolarRepository.findByDisipMax(disipMax , pageable);
	}
	
	// ------ TEMP_JUNTURA --------
	public Page<ComponenteTransistorBipolarEntity> findByTempJuntura(String tempJuntura , Pageable pageable) {
		return iTransistorBipolarRepository.findByTempJuntura(tempJuntura , pageable);
	}

	
}
