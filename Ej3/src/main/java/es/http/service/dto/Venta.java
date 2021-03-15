package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ventas")//en caso que la tabala sea diferente
public class Venta {
	//antes era suministra, ahora es Venta

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajero codigoCajero;

    @ManyToOne
    @JoinColumn(name = "producto")
    Producto codigoProducto;

    @ManyToOne
    @JoinColumn(name = "maquinasregistradoras")
    MaquinaRegistradora codigoMaquina;
	
	//Constructores
	
	public Venta() {
	
	}

	public Venta(int id, Cajero codigoCajero, MaquinaRegistradora codigoMaquina, Producto codigoProducto) {
		this.id = id;
		this.codigoCajero = codigoCajero;
		this.codigoMaquina = codigoMaquina;
		this.codigoProducto = codigoProducto;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Cajero getCodigoCajero() {
		return codigoCajero;
	}



	public void setCodigoCajero(Cajero codigoCajero) {
		this.codigoCajero = codigoCajero;
	}



	public MaquinaRegistradora getCodigoMaquina() {
		return codigoMaquina;
	}



	public void setCodigoMaquina(MaquinaRegistradora codigoMaquina) {
		this.codigoMaquina = codigoMaquina;
	}



	public Producto getCodigoProducto() {
		return codigoProducto;
	}



	public void setCodigoProducto(Producto codigoProducto) {
		this.codigoProducto = codigoProducto;
	}



	@Override
	public String toString() {
		return "Venta [id=" + id + ", codigoCajero=" + codigoCajero + ", codigoMaquina=" + codigoMaquina
				+ ", codigoProducto=" + codigoProducto + "]";
	}



	
	
}
