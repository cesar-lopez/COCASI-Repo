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


import persistencia.Rol;

public class Usuario {
	private Integer idUsuario;
	private Rol rol;
	private String login;
	private String nombre;
	private String apellido;
	private String contrasena;

	public Usuario() {
	}

	public Usuario(Rol rol, String login, String nombre, String apellido) {
		this.rol = rol;
		this.login = login;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	


	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}


	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
