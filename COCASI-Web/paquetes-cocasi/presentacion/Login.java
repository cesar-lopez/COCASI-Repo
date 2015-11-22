/*COMENTARIO: Esta clase permite controlar la accion provocada por el boton click al iniciar sesion
 * 
 * Aqui verificamos si existe algun usuario con el login introducido, si existe verificamos que la contrasena
 * corresponda y se le da acceso a la pagina de inicio
 * 
 * Sino
 * 
 * se muestra un mensaje de usuario o contrasena incorrecta
 * 
 * */

package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cuentas;
import dto.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mensaje = "Usuario o Clave Incorrecta";
		String login = request.getParameter("usuarioTextBox");
		String contrasena = request.getParameter("contrasenaTextBox");
		
		Cuentas c= new Cuentas();
		
		if (c.IniciarSesion(login, contrasena)) 
			request.getRequestDispatcher("default.jsp").forward(request, response);
		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			request.setAttribute("mensaje", mensaje);
			request.setAttribute("clase", "alert alert-danger");
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
