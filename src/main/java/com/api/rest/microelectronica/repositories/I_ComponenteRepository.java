package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteEntity;



@Repository
public interface I_ComponenteRepository extends JpaRepository<ComponenteEntity, Serializable>, PagingAndSortingRepository<ComponenteEntity, Serializable>{

	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteEntity findById(int id);
		
		public abstract List<ComponenteEntity> findByCodigo(String codigo);
	
		public abstract List<ComponenteEntity> findByImagen(String imagen);
		
		public abstract List<ComponenteEntity> findByNroPieza(String nroPieza);
		
		public abstract List<ComponenteEntity> findByCategoria(String categoria);
		
		public abstract List<ComponenteEntity> findByDescripcion(String descripcion);
	
		public abstract List<ComponenteEntity> findByFabricante(String fabricante);
		
		public abstract List<ComponenteEntity> findByStock(int stock);

		public abstract List<ComponenteEntity> findByPrecio(double precio);

		public abstract List<ComponenteEntity> findAll();
		
		public abstract Page<ComponenteEntity> findAll(Pageable pageable);

	
	
	
}
