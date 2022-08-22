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
		public abstract Page<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos , Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.longitud like %:longitud%")
		public abstract Page<ComponenteDetalleEntity> findByLongitud(String longitud, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.ancho like %:ancho%")
		public abstract Page<ComponenteDetalleEntity> findByAncho(String ancho, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.peso like %:peso%")
		public abstract Page<ComponenteDetalleEntity> findByPeso(String peso, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.material like %:material%")
		public abstract Page<ComponenteDetalleEntity> findByMaterial(String material, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeRecomendado like %:voltajeRecomendado%")
		public abstract Page<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeMinEntrada like %:voltajeMinEntrada%")
		public abstract Page<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada, Pageable pageable);
		@Query("select c from ComponenteDetalleEntity c where c.voltajeMaxEntrada like %:voltajeMaxEntrada%")
		public abstract Page<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada, Pageable pageable);
	
		public abstract Page<ComponenteDetalleEntity> findAll(Pageable pageable );

		@Query("select c from ComponenteDetalleEntity c where concat(lower(c.id), lower(c.hojaDeDatos), lower(c.longitud)"
				+ ", lower(c.ancho), lower(c.peso), lower(c.material), lower(c.voltajeRecomendado), lower(c.voltajeMinEntrada)"
				+ ", lower(c.voltajeMaxEntrada)) like lower(concat ( '%', ?1 , '%'))")
		public abstract Page<ComponenteDetalleEntity> findAll(String filtro, Pageable pageable);
		
	
}
