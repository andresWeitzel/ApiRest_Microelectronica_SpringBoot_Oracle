package com.api.rest.microelectronica.services;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;
import com.api.rest.microelectronica.exceptions.capacitor.electrolitico.CapacitorElectroliticoIdMismatchException;
import com.api.rest.microelectronica.exceptions.capacitor.electrolitico.CapacitorElectroliticoNotFoundException;
import com.api.rest.microelectronica.exceptions.componentes.detalles.ComponenteDetalleIdMismatchException;
import com.api.rest.microelectronica.exceptions.componentes.detalles.ComponenteDetalleNotFoundException;
import com.api.rest.microelectronica.repositories.I_ComponenteCapacitorElectroliticoRepository;

@Service
public class ComponenteCapacitorElectroliticoService {

	@Autowired
	private I_ComponenteCapacitorElectroliticoRepository iCapacitorElectroliticoRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager
			.getLogger(ComponenteCapacitorElectroliticoService.class);

	// =============== MÉTODOS CRUD ====================

	// ==================
	// ===== INSERT =====
	// ==================
	public void addCapacitorElectrolitico(ComponenteCapacitorElectroliticoEntity capacitorElectrolitico) {
		try {
			if (capacitorElectrolitico == null) {
				logger.error("ERROR addCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO " + capacitorElectrolitico + " ES NULO!!");
				throw new CapacitorElectroliticoNotFoundException("EL CAPACITOR ELECTROLITICO ES NULO");
			} else {
				iCapacitorElectroliticoRepository.save(capacitorElectrolitico);
				
			}

		} catch (Exception e) {
			logger.error("ERROR addCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO " + capacitorElectrolitico
					+ " NO SE HA INSERTADO EN LA DB!!");
			throw new CapacitorElectroliticoNotFoundException("NO SE PUDO ACTUALIZAR EL CAPACITOR ELECTROLITICO ", e, false,
					true);
		}
	}

	// ==================
	// ===== UPDATE =====
	// ==================
	public void updateCapacitorElectrolitico(ComponenteCapacitorElectroliticoEntity capacitorElectrolitico) {
		try {
			if (capacitorElectrolitico == null) {
				logger.error(
						"ERROR updateCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO " + capacitorElectrolitico + " ES NULO!!");
				throw new CapacitorElectroliticoNotFoundException("EL CAPACITOR ELECTROLITICO ES NULO");
			} else {
				iCapacitorElectroliticoRepository.save(capacitorElectrolitico);
				
			}

		} catch (Exception e) {
			logger.error("ERROR updateCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO " + capacitorElectrolitico
					+ " NO SE HA ACTUALIZADO EN LA DB!!");
			throw new CapacitorElectroliticoNotFoundException("NO SE PUDO ACTUALIZAR EL CAPACITOR ELECTROLITICO ", e, false,
					true);
		}
	}

	// ==================
	// ===== DELETE =====
	// ==================
	public void deleteCapacitorElectrolitico(int id) {
		try {
			if (id <= 0 || iCapacitorElectroliticoRepository.findById(id).getId() != id) {
				logger.error("ERROR deleteCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO CON EL " + id + " NO EXISTE!!");
				throw new CapacitorElectroliticoIdMismatchException("EL ID NO EXISTE EN LA DB");
			} else {
				iCapacitorElectroliticoRepository
						.delete(iCapacitorElectroliticoRepository.findById(id));
				
			}

		} catch (Exception e) {
			logger.error("ERROR deleteCapacitorElectrolitico : EL CAPACITOR ELECTROLITICO CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			throw new CapacitorElectroliticoNotFoundException("NO SE PUDO ELIMINAR EL CAPACITOR ELECTROLITICO ", e, false,
					true);
		}
	}

	// ===================
	// ===== GET ALL =====
	// ===================

	// ------- LISTADO PAGINADO ---------
	public List<ComponenteCapacitorElectroliticoEntity> getAllCapacitorElectrolitico(Pageable pageable) {

		return iCapacitorElectroliticoRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================
	// ===============
	// ===== GET =====
	// ===============
	// ------ ID --------
	public ComponenteCapacitorElectroliticoEntity findById(int id) {
		return iCapacitorElectroliticoRepository.findById(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ ID DE COMPONENTE --------
	public ComponenteCapacitorElectroliticoEntity findByIdComponente(int id) {
		return iCapacitorElectroliticoRepository.findByIdComponente(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ TIPO --------
	public Page<ComponenteCapacitorElectroliticoEntity> findByTipo(String tipo ,  Pageable pageable) {
		return iCapacitorElectroliticoRepository.findByTipo(tipo , pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ CAPACITANCIA --------
	public Page<ComponenteCapacitorElectroliticoEntity> findByCapacitancia(String capacitancia ,  Pageable pageable) {
		return iCapacitorElectroliticoRepository.findByCapacitancia(capacitancia , pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ TOLERANCIA --------
	public Page<ComponenteCapacitorElectroliticoEntity> findByTolerancia(String tolerancia ,  Pageable pageable) {
		return iCapacitorElectroliticoRepository.findByTolerancia(tolerancia , pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ RANGO_TEMPERATURA --------
	public Page<ComponenteCapacitorElectroliticoEntity> findByRangoTemperatura(String rangoTemperatura ,  Pageable pageable) {
		return iCapacitorElectroliticoRepository.findByRangoTemperatura(rangoTemperatura , pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ------ RANGO_TENSION_NOMINAL --------
	public Page<ComponenteCapacitorElectroliticoEntity> findByRangoTensionNominal(String rangoTensionNominal ,  Pageable pageable) {
		return iCapacitorElectroliticoRepository.findByRangoTensionNominal(rangoTensionNominal , pageable);
	}

}
