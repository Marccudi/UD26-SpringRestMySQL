package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="suministra")//en caso que la tabala sea diferente
public class Suministra {
	//antes era registroCurso, ahora es suministra

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "codigopieza")
    Pieza codigopieza;
 
    @ManyToOne
    @JoinColumn(name = "proveedorid")
    Proveedor proveedorid;
	
	
	
	//Constructores
	
	public Suministra() {
	
	}

	public Suministra(int id, Pieza codigopieza, Proveedor proveedorid) {
		this.id = id;
		this.codigopieza = codigopieza;
		this.proveedorid = proveedorid;
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




	public Pieza getCodigopieza() {
		return codigopieza;
	}




	public void setCodigopieza(Pieza codigopieza) {
		this.codigopieza = codigopieza;
	}




	public Proveedor getProveedorid() {
		return proveedorid;
	}




	public void setProveedorid(Proveedor proveedorid) {
		this.proveedorid = proveedorid;
	}




	@Override
	public String toString() {
		return "Suministra [id=" + id + ", codigopieza=" + codigopieza + ", proveedorid=" + proveedorid + "]";
	}


	
	
}
