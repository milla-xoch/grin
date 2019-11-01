package com.grin.logscooter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "scooter" )
@Data
public class Scooter  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3313621102252252187L;
	
	@Column(name="scooter_id")
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer scooterID;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scooter_fk")
    private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	private String tipo;

	public Integer getScooterID() {
		return scooterID;
	}

	public void setScooterID(Integer scooterID) {
		this.scooterID = scooterID;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
