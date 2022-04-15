package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;


@Repository
public interface I_ComponenteCapacitorElectroliticoRepository extends JpaRepository<ComponenteCapacitorElectroliticoEntity, Serializable>, PagingAndSortingRepository<ComponenteCapacitorElectroliticoEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteCapacitorElectroliticoEntity findById(int id);
		
		public abstract ComponenteCapacitorElectroliticoEntity findByIdComponente(int idComponente);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.tipo like %:tipo%")
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByTipo(String tipo);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.capacitancia like %:capacitancia%")
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByCapacitancia(String capacitancia);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.tolerancia like %:tolerancia%")
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByTolerancia(String tolerancia);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.rangoTemperatura like %:rangoTemperatura%")
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByRangoTemperatura(String rangoTemperatura);
		@Query("select c from ComponenteCapacitorElectroliticoEntity c where c.rangoTensionNominal like %:rangoTensionNominal%")
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByRangoTensionNominal(String rangoTensionNominal);
		
}
