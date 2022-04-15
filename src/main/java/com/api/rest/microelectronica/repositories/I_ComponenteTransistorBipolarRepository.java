package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteTransistorBipolarEntity;

@Repository
public interface I_ComponenteTransistorBipolarRepository extends JpaRepository<ComponenteTransistorBipolarEntity, Serializable>, PagingAndSortingRepository<ComponenteTransistorBipolarEntity, Serializable>{

	

	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteTransistorBipolarEntity findById(int id);
		
		public abstract ComponenteTransistorBipolarEntity findByIdComponente(int idComponente);
		
		@Query("select c from ComponenteTransistorBipolarEntity c where c.tipo like %:tipo%")
		public abstract List<ComponenteTransistorBipolarEntity> findByTipo(String tipo);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecEmis like %:voltajeColecEmis%")
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmis(String voltajeColecEmis);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecBase like %:voltajeColecBase%")
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecBase(String voltajeColecBase);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeEmisBase like %:voltajeEmisBase%")
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeEmisBase(String voltajeEmisBase);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecEmisSat like %:voltajeColecEmisSat%")
		public abstract List<ComponenteTransistorBipolarEntity> findByVoltajeColecEmisSat(String voltajeColecEmisSat);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.corrienteColec like %:corrienteColec%")
		public abstract List<ComponenteTransistorBipolarEntity> findByCorrienteColec(String corrienteColec);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.gananciaHfe like %:gananciaHfe%")
		public abstract List<ComponenteTransistorBipolarEntity> findByGananciaHfe(String gananciaHfe);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.disipMax like %:disipMax%")
		public abstract List<ComponenteTransistorBipolarEntity> findByDisipMax(String disipMax);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.tempJuntura like %:tempJuntura%")
		public abstract List<ComponenteTransistorBipolarEntity> findByTempJuntura(String tempJuntura);

		public abstract List<ComponenteTransistorBipolarEntity> findAll();
		
		public abstract Page<ComponenteTransistorBipolarEntity> findAll(Pageable pageable);
		
	


}
