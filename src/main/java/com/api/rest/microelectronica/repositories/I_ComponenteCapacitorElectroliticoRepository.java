package com.api.rest.microelectronica.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;


@Repository
public interface I_ComponenteCapacitorElectroliticoRepository extends JpaRepository<ComponenteCapacitorElectroliticoEntity, Serializable>, PagingAndSortingRepository<ComponenteCapacitorElectroliticoEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteCapacitorElectroliticoEntity findById(int id);
		
		public abstract ComponenteCapacitorElectroliticoEntity findByIdComponente(int idComponente);
		
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByTipo(String tipo);
	
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByCapacitancia(String capacitancia);
		
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByTolerancia(String tolerancia);
		
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByRangoTemperatura(String rangoTemperatura);
		
		public abstract List<ComponenteCapacitorElectroliticoEntity> findByRangoTensionNominal(String rangoTensionNominal);
		
}
