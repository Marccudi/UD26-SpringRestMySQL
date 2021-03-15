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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientifico")//en caso que la tabala sea diferente
public class Cientifico {

	//Atributos de entidad cientifico
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

	@OneToMany
    @JoinColumn(name="id")
    private List<AsignadoA> AsignadoA;
	
	//Constructores
	
	public Cientifico() {
	
	}

	public Cientifico(String id, String nombre, List<AsignadoA> AsignadoA) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.AsignadoA = AsignadoA;
	}

	//Getters y Setters
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
	 * @return the AsignadoA
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return AsignadoA;
	}

	/**
	 * @param registroProyecto the registroProyecto to set
	 */
	public void setRegistroProyecto(List<AsignadoA> AsignadoA) {
		this.AsignadoA = AsignadoA;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", nombre=" + nombre + " Asignado a: "+AsignadoA
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
