package persistencia;
// Generated Nov 16, 2015 3:40:15 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Falla generated by hbm2java
 */
@Entity
@Table(name = "falla", catalog = "cocasi")
public class Falla implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_falla", unique = true, nullable = false)
	public Integer getIdFalla() {
		return this.idFalla;
	}

	public void setIdFalla(Integer idFalla) {
		this.idFalla = idFalla;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "costo", nullable = false, precision = 15)
	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	@Column(name = "descripcion", nullable = false, length = 150)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "falla")
	public Set<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

}
