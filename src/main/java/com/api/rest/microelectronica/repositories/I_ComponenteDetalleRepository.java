package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;


@Repository
public interface I_ComponenteDetalleRepository extends JpaRepository<ComponenteDetalleEntity, Serializable>, PagingAndSortingRepository<ComponenteDetalleEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteDetalleEntity findById(int id);
		
		public abstract ComponenteDetalleEntity findByIdComponente(int id);
		@Query("select c from ComponenteDetalleEntity c where c.hojaDeDatos like %:hojaDeDatos%")
		public abstract List<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos);
		@Query("select c from ComponenteDetalleEntity c where c.longitud like %:longitud%")
		public abstract List<ComponenteDetalleEntity> findByLongitud(String longitud);
		@Query("select c from ComponenteDetalleEntity c where c.ancho like %:ancho%")
		public abstract List<ComponenteDetalleEntity> findByAncho(String ancho);
		@Query("select c from ComponenteDetalleEntity c where c.peso like %:peso%")
		public abstract List<ComponenteDetalleEntity> findByPeso(String peso);
		@Query("select c from ComponenteDetalleEntity c where c.material like %:material%")
		public abstract List<ComponenteDetalleEntity> findByMaterial(String material);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeRecomendado like %:voltajeRecomendado%")
		public abstract List<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeMinEntrada like %:voltajeMinEntrada%")
		public abstract List<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeMaxEntrada like %:voltajeMaxEntrada%")
		public abstract List<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada);
	
		public abstract List<ComponenteDetalleEntity> findAll();
		
		public abstract Page<ComponenteDetalleEntity> findAll(Pageable pageable);
		
	
}
