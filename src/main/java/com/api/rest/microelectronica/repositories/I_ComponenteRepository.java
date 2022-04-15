package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteEntity;



@Repository
public interface I_ComponenteRepository extends JpaRepository<ComponenteEntity, Serializable>, PagingAndSortingRepository<ComponenteEntity, Serializable>{

	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteEntity findById(int id);
		
		@Query("select c from ComponenteEntity c where c.codigo like %:codigo%")
		public abstract List<ComponenteEntity> findByCodigo(String codigo);
		@Query("select c from ComponenteEntity c where c.imagen like %:imagen%")
		public abstract List<ComponenteEntity> findByImagen(String imagen);
		@Query("select c from ComponenteEntity c where c.nroPieza like %:nroPieza%")
		public abstract List<ComponenteEntity> findByNroPieza(String nroPieza);
		@Query("select c from ComponenteEntity c where c.categoria like %:categoria%")
		public abstract List<ComponenteEntity> findByCategoria(String categoria);
		@Query("select c from ComponenteEntity c where c.descripcion like %:descripcion%")
		public abstract List<ComponenteEntity> findByDescripcion(String descripcion);
		@Query("select c from ComponenteEntity c where c.fabricante like %:fabricante%")
		public abstract List<ComponenteEntity> findByFabricante(String fabricante);
		
		public abstract List<ComponenteEntity> findByStock(int stock);

		public abstract List<ComponenteEntity> findByPrecio(double precio);

		public abstract List<ComponenteEntity> findAll();
		
		public abstract Page<ComponenteEntity> findAll(Pageable pageable);

	
	
	
}
