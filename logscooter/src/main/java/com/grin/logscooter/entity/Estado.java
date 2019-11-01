package com.grin.logscooter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "estado" )
@Data
public class Estado  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4090040604335762204L;
	
	@Column(name=" estado_id")
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer estadoID;
	
	private String nombre;

	private String status;

	public Integer getEstadoID() {
		return estadoID;
	}

	public void setEstadoID(Integer estadoID) {
		this.estadoID = estadoID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
