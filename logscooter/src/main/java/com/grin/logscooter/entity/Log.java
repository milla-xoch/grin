package com.grin.logscooter.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table( name = "log" )
@Data
public class Log  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2649048067220950701L;
	
	@Column(name="log_id")
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer logId;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_fk_3")
	private Scooter scooter;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_fk_2")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_fk")
    private EstadoTransicion estadoTransicion;

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Scooter getScooter() {
		return scooter;
	}

	public void setScooter(Scooter scooter) {
		this.scooter = scooter;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public EstadoTransicion getEstadoTransicion() {
		return estadoTransicion;
	}

	public void setEstadoTransicion(EstadoTransicion estadoTransicion) {
		this.estadoTransicion = estadoTransicion;
	}
	
	

}
