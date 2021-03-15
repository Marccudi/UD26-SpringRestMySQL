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
@Table(name="proveedores")//en caso que la tabala sea diferente
public class Proveedor {
//era curso, ahora es proveedores
	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

	
	@OneToMany
    @JoinColumn(name="id")
    private List<Suministra> suministra;
	
	//Constructores
	
	public Proveedor() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param registroCurso
	 */
	public Proveedor(String id, String nombre, List<Suministra> suministra) {
		this.id = id;
		this.nombre = nombre;
		this.suministra = suministra;
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
	 * @return the registroCurso
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}

	


	
	
	
}
