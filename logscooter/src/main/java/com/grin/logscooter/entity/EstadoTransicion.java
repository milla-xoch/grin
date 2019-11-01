package com.grin.logscooter.entity;

import java.io.Serializable;

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
@Table(name = "estado_transicion")
@Data
public class EstadoTransicion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4430589797193286147L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_transicion_fk")
    private Estado estadoOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_transicion_fk_1")
    private Estado estadoDestino;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_transicion_fk_2")
    private Transicion transicion;
	
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estado getEstadoOrigen() {
		return estadoOrigen;
	}

	public void setEstadoOrigen(Estado estadoOrigen) {
		this.estadoOrigen = estadoOrigen;
	}

	public Estado getEstadoDestino() {
		return estadoDestino;
	}

	public void setEstadoDestino(Estado estadoDestino) {
		this.estadoDestino = estadoDestino;
	}

	public Transicion getTransicion() {
		return transicion;
	}

	public void setTransicion(Transicion transicion) {
		this.transicion = transicion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
