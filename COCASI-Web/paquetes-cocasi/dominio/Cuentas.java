/*
 * COMENTARIO:  Este archivo se encuentra en el paquete de Dominio,
 *  lo que indica que representa la logica del negocio o de la aplicacion
 *  
 *  
 *  Con el tendremos varios metodos que nos permitiran manipular las cuentas de usuarios
 * 
 * */

package dominio;

import presentacion.excepciones.ExcepcionUsuarioNoEncontradoEnBD;

public class Cuentas {

	
	/*COMENTARIO: Este metodo sirve para iniciar sesion, busca usuario en BD 
	 *y compara con los datos introducidos*/
	public Boolean IniciarSesion(String login, String contrasena){
		
		dto.Usuario usuario = new dto.Usuario();
		boolean inicio;
		
		try {
			usuario = persistencia.DAOUsuario.getUsuarioByLogin(login);
			
			

			if (usuario != null 
					&& usuario.getLogin() == login 
					&& usuario.getContrasena() == contrasena) inicio = true;
			else inicio = false;
			
		} catch (ExcepcionUsuarioNoEncontradoEnBD e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			inicio = false;
		}
		
		
		return inicio;		
	}
}
