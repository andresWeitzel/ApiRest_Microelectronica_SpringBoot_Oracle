package com.api.rest.microelectronica.services;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.microelectronica.entities.ComponenteEntity;
import com.api.rest.microelectronica.repositories.I_ComponenteRepository;


@Service
public class ComponenteService{

	@Autowired
	private I_ComponenteRepository iComponenteRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componente + " ES NULO!!");
				return false;
			} else {
				iComponenteRepository.save(componente);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componente + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " ES NULO!!");
				return false;
			} else {
				iComponenteRepository.save(componente);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " NO SE HA ACTUALIZADO EN LA DB!!");
			return false;
		}
	}

	// ------ DELETE --------
	public boolean deleteComponente(int id) {
		try {
			if (id <= 0) {
				logger.error("ERROR deleteComponente : EL COMPONENTE CON EL id " + id + " NO EXISTE!!");
				return false;
			} else {
				iComponenteRepository.delete(iComponenteRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL id " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ------ SELECT --------
	// ------- LISTADO COMPLETO ---------
	public List<ComponenteEntity> getAllComponente() {

		return iComponenteRepository.findAll();
	}

	// ------ SELECT --------
	// ------- LISTADO PAGINADO ---------
	public List<ComponenteEntity> getAllComponente(Pageable pageable) {

		return iComponenteRepository.findAll(pageable).getContent();
	}
	
	// ------ SELECT --------
	// ------- PAGINADO ---------
	public Page<ComponenteEntity> getAllComponentePage(Pageable pageable) {

		return iComponenteRepository.findAll(pageable);
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteEntity findById(int id) {
		return iComponenteRepository.findById(id);
	}

	// ------ ID WITH OPCIONAL --------
	public ComponenteEntity findByIdOptional(int id) {
		
		Optional<ComponenteEntity> optional = Optional.of(iComponenteRepository.findById(id));
		
		ComponenteEntity componente = null;
		
		if(optional.isPresent()) {
			
			componente = optional.get();
		}else {
			throw new RuntimeException("No se ha encontrado el componente con el id "+id+" en la db!!");
		}
		
		return componente;
		
	}

	// ------ CODIGO --------
	public List<ComponenteEntity> findByCodigo(String codigo) {
		return iComponenteRepository.findByCodigo(codigo);
	}

	// ------ IMAGEN --------
	public List<ComponenteEntity> findByImagen(String imagen) {
		return iComponenteRepository.findByImagen(imagen);
	}

	// ------ NRO_PIEZA --------
	public List<ComponenteEntity> findByNroPieza(String nroPieza) {
		return iComponenteRepository.findByNroPieza(nroPieza);
	}

	// ------ CATEGORIA --------
	public List<ComponenteEntity> findByCategoria(String categoria) {
		return iComponenteRepository.findByCategoria(categoria);
	}

	// ------ DESCRIPCION --------
	public List<ComponenteEntity> findByDescripcion(String descripcion) {
		return iComponenteRepository.findByDescripcion(descripcion);
	}

	// ------ FABRICANTE --------
	public List<ComponenteEntity> findByFabricante(String fabricante) {
		return iComponenteRepository.findByFabricante(fabricante);
	}

	// ------ STOCK --------
	public List<ComponenteEntity> findByStock(int cantidad) {
		return iComponenteRepository.findByStock(cantidad);
	}

	// ------ PRECIO --------
	public List<ComponenteEntity> findByPrecio(double precio) {
		return iComponenteRepository.findByPrecio(precio);
	}
	
	
	// =============== MÉTODOS PARA GRAFICO ====================

	//------ STOCK POR CATEGORIA ------
	public int stockPorCategoria(List<ComponenteEntity> listComp , String categoria ) {
		
		return (int)(listComp
						.stream()
						.filter(comp->comp.getCategoria().equalsIgnoreCase(categoria))
						.mapToInt(comp->comp.getStock()).sum());
	}
	
	//------ STOCK POR FABRICANTE ------
	public int stockPorFabricante(List<ComponenteEntity> listComp , String fabricante ) {
		
		return (int)(listComp
						.stream()
						.filter(comp->comp.getFabricante().equalsIgnoreCase(fabricante))
						.mapToInt(comp->comp.getStock()).sum());
	}
	
	
	
	
	
}