/*COMENTARIO: Esta clase permite hacer CRUD (Create, Read, Update, Delete) en la 
 * tabla usuarios
 * 
 * */

package persistencia;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import presentacion.excepciones.ExcepcionUsuarioNoEncontradoEnBD;


//Hacer operaciones con la base de datos para las entidades... 
public class DAOUsuario {

	private static SessionFactory db;
	private static Session con;
	private static Transaction tx;
	private static Query query;
	
	public static List<dto.Usuario> getUsuarios(){
		List<dto.Usuario> dtoUsuarios = new ArrayList<>();
		List<Usuario> dbUsuarios = new ArrayList<>();
		
		openDB();
		query = con.createQuery("FROM Usuarios U ORDER BY U.login ASC");
		dbUsuarios = query.list();
		
		for (Usuario dbUsuario : dbUsuarios) {
    		
			dto.Usuario dtoUsuario = new dto.Usuario();
			
			dtoUsuario.setIdUsuario(dbUsuario.getIdUsuario());
			dtoUsuario.setNombre(dbUsuario.getNombre());
			dtoUsuario.setLogin(dbUsuario.getLogin());
			dtoUsuario.setContrasena(dbUsuario.getContrasena());
			dtoUsuario.setRol(dbUsuario.getRol());
			
			
			dtoUsuarios.add(dtoUsuario);
		}
		closeDB();
		
		return dtoUsuarios;
	}
	
//Obtener usuario desde la base de datos por Login...
	public static dto.Usuario getUsuario(String login) throws ExcepcionUsuarioNoEncontradoEnBD{
		
			dto.Usuario dtoUsuario = new dto.Usuario();
			Usuario dbUsuario = new Usuario();
			
			//Abrin conexion con base de datos...
			openDB();
			
			try {
				//Nuevo criterio
				Criteria cri = con.createCriteria(Usuario.class);
				//Agregar restriccion de login
				cri.add(Restrictions.eq("login", login));
				
				cri.addOrder(Order.asc("nombre"));
				
				dbUsuario = (Usuario) cri.uniqueResult();
				
				dtoUsuario.setIdUsuario(dbUsuario.getIdUsuario());
				dtoUsuario.setNombre(dbUsuario.getNombre());
				dtoUsuario.setLogin(dbUsuario.getLogin());
				dtoUsuario.setContrasena(dbUsuario.getContrasena());
				dtoUsuario.setRol(dbUsuario.getRol());
				
			} catch (NullPointerException e) {
				// TODO: handle exception
				throw new presentacion.excepciones.ExcepcionUsuarioNoEncontradoEnBD();
			}
			
			
			
			closeDB();
			
			return dtoUsuario;
	}
	
	
	
	 public static dto.Usuario getUsuarioByLogin(String login) throws ExcepcionUsuarioNoEncontradoEnBD {
	        
		 dto.Usuario dtoUsuario = new dto.Usuario();
		 Usuario dbUsuario = new Usuario();
	        Transaction trns = null;
	        
	        Session session = HibernateUtil.getSessionFactory().openSession();
	       
	        try {
	            trns = session.beginTransaction();
	            String queryString = "from Usuario where login = :login";
	            Query query = session.createQuery(queryString);
	            query.setString("login", login);
	            dbUsuario = (Usuario) query.uniqueResult();
	            
	            dtoUsuario.setIdUsuario(dbUsuario.getIdUsuario());
				dtoUsuario.setNombre(dbUsuario.getNombre());
				dtoUsuario.setLogin(dbUsuario.getLogin());
				dtoUsuario.setContrasena(dbUsuario.getContrasena());
				dtoUsuario.setRol(dbUsuario.getRol());
	        } 
	        catch (NullPointerException e) {
					// TODO: handle exception
					throw new presentacion.excepciones.ExcepcionUsuarioNoEncontradoEnBD();
				}
	        catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        
	        return dtoUsuario;
	    }
	
	 private static void openDB(){
	    	
	    	db = HibernateUtil.getSessionFactory();
	    	con = db.openSession();
	    	tx = con.beginTransaction();
	    }
	    
	    private static void closeDB(){
	    	tx.commit();
	    	con.close();
	    }
	
}
