package es.http.service.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="proyecto")//en caso que la tabala sea diferente
public class Proyecto {

	//Atributos de entidad proyecto
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "horas")//no hace falta si se llama igual
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<AsignadoA> AsignadoA;
	
	//Constructores
	
	public Proyecto() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 */
	public Proyecto(String id, String nombre, int horas, List<AsignadoA> AsignadoA) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.AsignadoA = AsignadoA;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @return the registroProyecto
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsingadoA() {
		return AsignadoA;
	}

	/**
	 * @param registroProyecto the registroProyecto to set
	 */
	public void setAsignadoA(List<AsignadoA> AsignadoA) {
		this.AsignadoA = AsignadoA;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}


	
	
	
}
