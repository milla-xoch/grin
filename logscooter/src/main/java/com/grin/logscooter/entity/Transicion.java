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
@Table( name = "transicion" )
@Data
public class Transicion  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6957678389499279865L;
	
	@Column(name="transicion_id")
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer transicionID;
	
	private String nombre;
	
	private String status;

	public Integer getTransicionID() {
		return transicionID;
	}

	public void setTransicionID(Integer transicionID) {
		this.transicionID = transicionID;
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
