package com.api.rest.microelectronica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "componentes_capacitores_electroliticos")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteCapacitorElectroliticoEntity {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_cap_elect")
	@SequenceGenerator(name = "seq_comp_cap_elect", sequenceName = "id_seq_comp_cap_elect", allocationSize = 1)
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "id_componente",unique=true)
	private int idComponente;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "capacitancia")
	private String capacitancia;

	@Column(name = "tolerancia")
	private String tolerancia;

	@Column(name = "rango_temperatura")
	private String rangoTemperatura;

	@Column(name = "rango_tension_nominal")
	private String rangoTensionNominal;

}