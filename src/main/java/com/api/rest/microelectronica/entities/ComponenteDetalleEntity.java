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

@Table(name="componentes_detalles")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteDetalleEntity {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_det")
	@SequenceGenerator(name = "seq_comp_det", sequenceName = "id_seq_comp_det" , allocationSize=1)
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="id_componente")
	private int idComponente;
	
	@Column(name="hoja_de_datos")
	private String hojaDeDatos;
	
	@Column(name="longitud")
	private String longitud;
	
	@Column(name="ancho")
	private String ancho;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="material")
	private String material;
	
	@Column(name="voltaje_recomendado") 
	private String voltajeRecomendado;
	
	@Column(name="voltaje_min_entrada")
	private String voltajeMinEntrada;
	
	@Column(name="voltaje_max_entrada")
	private String voltajeMaxEntrada;
	

}