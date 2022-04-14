package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;

@Repository
public interface I_ComponenteTransistorBipolarRepository extends JpaRepository<ComponenteTransistorBipolarEntity, Serializable>, PagingAndSortingRepository<ComponenteTransistorBipolarEntity, Serializable>{

	

	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteTransistorBipolarEntity findById(int id);
		
		public abstract ComponenteTransistorBipolarEntity findByIdComponente(int idComponente);
		
		public abstract List<ComponenteTransistorBipolarEntity> findByTipo(String tipo);
	
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmis(String voltajeColecEmis);
		
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecBase(String voltajeColecBase);
		
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeEmisBase(String voltajeEmisBase);
		
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmisSat(String voltajeColecEmisSat);
	
		public abstract List<ComponenteTransistorBipolarEntity> findByCorrienteColec(String corrienteColec);
		
		public abstract List<ComponenteTransistorBipolarEntity> findByGananciaHfe(String gananciaHfe);

		public abstract List<ComponenteTransistorBipolarEntity> findByDisipMax(String disipMax);

		public abstract List<ComponenteTransistorBipolarEntity> findByTempJuntura(String tempJuntura);

		public abstract List<ComponenteTransistorBipolarEntity> findAll();
		
		public abstract Page<ComponenteTransistorBipolarEntity> findAll(Pageable pageable);
		
	


}
