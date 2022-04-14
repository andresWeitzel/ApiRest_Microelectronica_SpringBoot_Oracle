package com.api.rest.microelectronica.services;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;
import com.api.rest.microelectronica.repositories.I_ComponenteCapacitorElectroliticoRepository;


@Service
public class ComponenteCapacitorElectroliticoService {


	@Autowired
	private I_ComponenteCapacitorElectroliticoRepository iComponenteCapacitorElectroliticoRepository;


	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteCapacitorElectroliticoService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {
		try {
			if (componenteCapacitorElectrolitico == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componenteCapacitorElectrolitico + " ES NULO!!");
				return false;
			} else {
				iComponenteCapacitorElectroliticoRepository.save(componenteCapacitorElectrolitico);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componenteCapacitorElectrolitico + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {
		try {
			if (componenteCapacitorElectrolitico == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componenteCapacitorElectrolitico + " ES NULO!!");
				return false;
			} else {
				iComponenteCapacitorElectroliticoRepository.save(componenteCapacitorElectrolitico);
				return true;
			}

		} catch (Exception e) {
			logger.error(
					"ERROR updateComponente : EL COMPONENTE " + componenteCapacitorElectrolitico + " NO SE HA ACTUALIZADO EN LA DB!!");
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
				iComponenteCapacitorElectroliticoRepository.delete(iComponenteCapacitorElectroliticoRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ------ SELECT --------
	//------- LISTADO COMPLETO ---------
	public List<ComponenteCapacitorElectroliticoEntity> getAllComponente() {

		return iComponenteCapacitorElectroliticoRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteCapacitorElectroliticoEntity> getAllComponente(Pageable pageable) {

		return iComponenteCapacitorElectroliticoRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteCapacitorElectroliticoEntity findById(int id) {
		return iComponenteCapacitorElectroliticoRepository.findById(id);
	}

	// ------ ID DE COMPONENTE --------
	public ComponenteCapacitorElectroliticoEntity findByIdComponente(int id) {
		return iComponenteCapacitorElectroliticoRepository.findByIdComponente(id);
	}

	// ------ TIPO --------
	public List<ComponenteCapacitorElectroliticoEntity> findByTipo(String tipo) {
		return iComponenteCapacitorElectroliticoRepository.findByTipo(tipo);
	}

	// ------ CAPACITANCIA --------
	public List<ComponenteCapacitorElectroliticoEntity> findByCapacitancia(String capacitancia) {
		return iComponenteCapacitorElectroliticoRepository.findByCapacitancia(capacitancia);
	}

	// ------ TOLERANCIA --------
	public List<ComponenteCapacitorElectroliticoEntity> findByTolerancia(String tolerancia) {
		return iComponenteCapacitorElectroliticoRepository.findByTolerancia(tolerancia);
	}

	// ------ RANGO_TEMPERATURA --------
	public List<ComponenteCapacitorElectroliticoEntity> findByRangoTemperatura(String rangoTemperatura) {
		return iComponenteCapacitorElectroliticoRepository.findByRangoTemperatura(rangoTemperatura);
	}
	// ------ RANGO_TENSION_NOMINAL --------
		public List<ComponenteCapacitorElectroliticoEntity> findByRangoTensionNominal(String rangoTensionNominal) {
			return iComponenteCapacitorElectroliticoRepository.findByRangoTensionNominal(rangoTensionNominal);
		}

	
}
