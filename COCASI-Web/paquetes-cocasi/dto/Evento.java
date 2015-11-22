/*
 * COMENTARIO:  Este archivo se encuentra en el paquete de DTO (Data Transfer Object);
 *  la idea de este paquete es crear entidades con las misma caracteristicas que las 
 *  creada en el paquete de persistencia con la finalidad de que la logica de negocio no
 *  manipule directamente con las enidades de la base de datos.
 *  
 *  Por Cada Clase de Entidad en persistencia, tendremos una clase aqui
 * 
 * */

package dto;

import java.math.BigDecimal;
import java.util.Date;

public class Evento  {


	private Integer idEvento;
	private Falla falla;
	private Date fechaIni;
	private Date fechaFin;
	private BigDecimal costoTotal;
	private String mitigante;

	public Evento() {
	}

	public Evento(Falla falla, Date fechaIni, Date fechaFin, BigDecimal costoTotal, String mitigante) {
		this.falla = falla;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.costoTotal = costoTotal;
		this.mitigante = mitigante;
	}

	public Integer getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Falla getFalla() {
		return this.falla;
	}

	public void setFalla(Falla falla) {
		this.falla = falla;
	}

	public Date getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getCostoTotal() {
		return this.costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
	}

	
	public String getMitigante() {
		return this.mitigante;
	}

	public void setMitigante(String mitigante) {
		this.mitigante = mitigante;
	}

}