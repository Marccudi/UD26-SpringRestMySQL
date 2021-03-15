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
@Table(name="maquinasregistradoras")//en caso que la tabala sea diferente
public class MaquinaRegistradora {
//era una copia de pieza/cajero, ahora es MaquinaRegistradora
	
	//Atributos de entidad estudiante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;
 
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Venta> venta;
	
	//Constructores
	
	public MaquinaRegistradora() {
	
	}

	public MaquinaRegistradora(int id, int piso, List<Venta> Venta) {
		super();
		this.id = id;
		this.piso = piso;
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
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param nombre the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
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
		return "Pieza [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}


	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
