package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;


@Repository
public interface I_ComponenteDetalleRepository extends JpaRepository<ComponenteDetalleEntity, Serializable>, PagingAndSortingRepository<ComponenteDetalleEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteDetalleEntity findById(int id);
		
		public abstract ComponenteDetalleEntity findByIdComponente(int id);
		
		public abstract List<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos);
	
		public abstract List<ComponenteDetalleEntity> findByLongitud(String longitud);
		
		public abstract List<ComponenteDetalleEntity> findByAncho(String ancho);
		
		public abstract List<ComponenteDetalleEntity> findByPeso(String peso);
		
		public abstract List<ComponenteDetalleEntity> findByMaterial(String material);
		
		public abstract List<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado);
		
		public abstract List<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada);
	
		public abstract List<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada);
	
		public abstract List<ComponenteDetalleEntity> findAll();
		
		public abstract Page<ComponenteDetalleEntity> findAll(Pageable pageable);
		
	
}
