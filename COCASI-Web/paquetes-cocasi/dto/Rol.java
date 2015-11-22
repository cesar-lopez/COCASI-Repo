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


import java.util.HashSet;
import java.util.Set;


import persistencia.Usuario;

public class Rol {

	private Integer idRol;
	private String nombre;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public Rol() {
	}

	public Rol(String nombre) {
		this.nombre = nombre;
	}

	public Rol(String nombre, Set<Usuario> usuarios) {
		this.nombre = nombre;
		this.usuarios = usuarios;
	}


	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
