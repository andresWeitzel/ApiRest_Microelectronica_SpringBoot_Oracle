package com.api.rest.microelectronica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="componentes")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "Entidad Componente")
public class ComponenteEntity {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp")
	@SequenceGenerator(name = "seq_comp", sequenceName = "id_seq_comp" , allocationSize=1)
	@Id
	@Column(name="id") 
	@ApiModelProperty(notes = "id autoincrementable del Componente")
	private int id;
	
	@Column(name="codigo")
	@ApiModelProperty(notes = "Código del Componente (EJ: KSJSDK-3CD005H)")
	private String codigo;
	
	@Column(name="imagen")
	@ApiModelProperty(notes = "Imagen del Componente (EJ: https://www.cdronline.com.ar/thumb/3658DCD905164D7199C7BCEDD00032AB.jpg)")
	private String imagen;
	
	@Column(name="nro_pieza")
	@ApiModelProperty(notes = "Nro de Pieza del Componente (EJ: 3YU7E8)")
	private String nroPieza;
	
	@Column(name="categoria")
	@ApiModelProperty(notes = "Categoria del Componente (EJ: Transistores BJT)")
	private String categoria;
	
	@Column(name="descripcion") 
	@ApiModelProperty(notes = "Descripción del Componente (EJ: Transistor BJT PNP)")
	private String descripcion;
	
	@Column(name="fabricante")
	@ApiModelProperty(notes = "Fabricante del Componente (EJ: CENTRAL SEMICONDUCTOR)")
	private String fabricante;
	
	@Column(name="stock")
	@ApiModelProperty(notes = "Stock del Componente (200)")
	private int stock;
	
	@Column(name="precio")
	@ApiModelProperty(notes = "Precio del Componente (EJ: 10.0)")
	private double precio;
	

}