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

@Table(name = "componentes")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteEntity {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp")
	@SequenceGenerator(name = "seq_comp", sequenceName = "id_seq_comp", allocationSize = 1)
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "imagen")
	private String imagen;

	@Column(name = "nro_pieza")
	private String nroPieza;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "fabricante")
	private String fabricante;

	@Column(name = "stock")
	private int stock;

	@Column(name = "precio")
	private double precio;

}