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
		public abstract Page<ComponenteEntity> findByCodigo(String codigo, Pageable pageable);
		
		@Query("select c from ComponenteEntity c where c.imagen like %:imagen%")
		public abstract Page<ComponenteEntity> findByImagen(String imagen, Pageable pageable);
		
		@Query("select c from ComponenteEntity c where c.nroPieza like %:nroPieza%")
		public abstract Page<ComponenteEntity> findByNroPieza(String nroPieza, Pageable pageable);
		
		@Query("select c from ComponenteEntity c where c.categoria like %:categoria%")
		public abstract Page<ComponenteEntity> findByCategoria(String categoria, Pageable pageable);
		
		@Query("select c from ComponenteEntity c where c.descripcion like %:descripcion%")
		public abstract Page<ComponenteEntity> findByDescripcion(String descripcion , Pageable pageable);
		
		@Query("select c from ComponenteEntity c where c.fabricante like %:fabricante%")
		public abstract Page<ComponenteEntity> findByFabricante(String fabricante , Pageable pageable);
		
		public abstract Page<ComponenteEntity> findByStock(int stock , Pageable pageable);

		public abstract Page<ComponenteEntity> findByPrecio(double precio , Pageable pageable);

		public abstract Page<ComponenteEntity> findAll(Pageable pageable );

		@Query("select c from ComponenteEntity c where concat(lower(c.id), lower(c.codigo), lower(c.imagen)"
				+ ", lower(c.nroPieza), lower(c.categoria), lower(c.descripcion), lower(c.fabricante), lower(c.stock)"
				+ ", lower(c.precio)) like lower(concat ( '%', ?1 , '%'))")
		public abstract Page<ComponenteEntity> findAll(String filtro, Pageable pageable);

	
	
	
}
