package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="asignado_a")//en caso que la tabala sea diferente
public class AsignadoA {

	//Atributos de entidad registro_proyecto
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private String id;
	
	@ManyToOne
    @JoinColumn(name = "cientifico")
    Cientifico cientifico;
 
    @ManyToOne
    @JoinColumn(name = "proyecto")
    Proyecto proyecto;
	

	//Constructores
	
	public AsignadoA() {
	
	}

	public AsignadoA(String id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;

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
	 * @return the cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}


	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}


	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}


	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}




	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "RegistroProyecto [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto 
				 + "]";
	}

	
	
	
	
	




		
	
	
	
}
