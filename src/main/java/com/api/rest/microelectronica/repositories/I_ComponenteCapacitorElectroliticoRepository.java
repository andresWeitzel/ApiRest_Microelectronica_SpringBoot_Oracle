package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;
import com.api.rest.microelectronica.entities.ComponenteDetalleEntity;


@Repository
public interface I_ComponenteCapacitorElectroliticoRepository extends JpaRepository<ComponenteCapacitorElectroliticoEntity, Serializable>, PagingAndSortingRepository<ComponenteCapacitorElectroliticoEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteCapacitorElectroliticoEntity findById(int id);
		
		public abstract ComponenteCapacitorElectroliticoEntity findByIdComponente(int idComponente);
		
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.tipo like %:tipo%")
		public abstract Page<ComponenteCapacitorElectroliticoEntity> findByTipo(String tipo , Pageable pageable);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.capacitancia like %:capacitancia%")
		public abstract Page<ComponenteCapacitorElectroliticoEntity> findByCapacitancia(String capacitancia, Pageable pageable);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.tolerancia like %:tolerancia%")
		public abstract Page<ComponenteCapacitorElectroliticoEntity> findByTolerancia(String tolerancia, Pageable pageable);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.rangoTemperatura like %:rangoTemperatura%")
		public abstract Page<ComponenteCapacitorElectroliticoEntity> findByRangoTemperatura(String rangoTemperatura, Pageable pageable);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.rangoTensionNominal like %:rangoTensionNominal%")
		public abstract Page<ComponenteCapacitorElectroliticoEntity> findByRangoTensionNominal(String rangoTensionNominal, Pageable pageable);

		public abstract Page<ComponenteCapacitorElectroliticoEntity> findAll(Pageable pageable);
}
