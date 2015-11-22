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
import java.util.HashSet;
import java.util.Set;

import persistencia.Evento;

public class Falla {

	
	private Integer idFalla;
	private String nombre;
	private BigDecimal costo;
	private String descripcion;
	private Set<Evento> eventos = new HashSet<Evento>(0);

	public Falla() {
	}

	public Falla(String nombre, BigDecimal costo, String descripcion) {
		this.nombre = nombre;
		this.costo = costo;
		this.descripcion = descripcion;
	}

	public Falla(String nombre, BigDecimal costo, String descripcion, Set<Evento> eventos) {
		this.nombre = nombre;
		this.costo = costo;
		this.descripcion = descripcion;
		this.eventos = eventos;
	}


	public Integer getIdFalla() {
		return this.idFalla;
	}

	public void setIdFalla(Integer idFalla) {
		this.idFalla = idFalla;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public Set<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

}
