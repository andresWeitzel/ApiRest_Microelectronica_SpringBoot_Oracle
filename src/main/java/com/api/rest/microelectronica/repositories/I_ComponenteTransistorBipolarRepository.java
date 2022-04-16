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
		public abstract Page<ComponenteTransistorBipolarEntity> findByTipo(String tipo , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecEmis like %:voltajeColecEmis%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByVoltajeColecEmis(String voltajeColecEmis , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecBase like %:voltajeColecBase%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByVoltajeColecBase(String voltajeColecBase , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeEmisBase like %:voltajeEmisBase%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByVoltajeEmisBase(String voltajeEmisBase , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.voltajeColecEmisSat like %:voltajeColecEmisSat%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByVoltajeColecEmisSat(String voltajeColecEmisSat , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.corrienteColec like %:corrienteColec%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByCorrienteColec(String corrienteColec , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.gananciaHfe like %:gananciaHfe%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByGananciaHfe(String gananciaHfe , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.disipMax like %:disipMax%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByDisipMax(String disipMax , Pageable pageable);
		@Query("select c from ComponenteTransistorBipolarEntity c where c.tempJuntura like %:tempJuntura%")
		public abstract Page<ComponenteTransistorBipolarEntity> findByTempJuntura(String tempJuntura , Pageable pageable);

	
		public abstract Page<ComponenteTransistorBipolarEntity> findAll(Pageable pageable);
		
	


}
