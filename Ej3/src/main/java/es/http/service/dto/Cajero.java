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
@Table(name="Cajeros")//en caso que la tabala sea diferente
public class Cajero {
//era pieza, ahora es Cajero
	//Atributos de entidad estudiante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nombre;

	
	@OneToMany
    @JoinColumn(name="id")
    private List<Venta> venta;
	
	//Constructores
	
	public Cajero() {
	
	}

	public Cajero(int id, String nombre, List<Venta> Venta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.venta = Venta;
	}

	//Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ventas")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", nombre=" + nombre + ", venta=" + venta + "]";
	}


	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
