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

@Table(name="componentes_transistores_bipolares")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteTransistorBipolarEntity {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_trans_bip")
	@SequenceGenerator(name = "seq_comp_trans_bip", sequenceName = "id_seq_comp_trans_bip" , allocationSize=1)
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="id_componente")
	private int idComponente;
	
	@Column(name="tipo")
	private  String tipo;
	
	@Column(name="voltaje_colec_emis")
	private String voltajeColecEmis;
	
	@Column(name="voltaje_colec_base")
	private String voltajeColecBase;
	
	@Column(name="voltaje_emis_base")
	private String voltajeEmisBase;
	
	@Column(name="voltaje_colec_emis_sat")
	private String voltajeColecEmisSat;
	
	@Column(name="corriente_colec")
	private String corrienteColec;
	
	@Column(name="ganancia_hfe")
	private String gananciaHfe;
	
	@Column(name="disip_max")
	private String disipMax;
	
	@Column(name="temp_juntura")
	private String tempJuntura;
	
	
	
	
	
	
	
	
}
