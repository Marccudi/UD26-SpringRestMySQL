package es.http.service.service;

import java.util.List;

import es.http.service.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	//Metodos del CRUD
		public List<MaquinaRegistradora> listarMaquinaRegistradoras(); //Listar All 
		
		public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);	//Guarda un MaquinaRegistradora CREATE
		
		public MaquinaRegistradora maquinaRegistradoraXID(int id); //Leer datos de un MaquinaRegistradora READ
		
		public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); //Actualiza datos del maquinaRegistradora UPDATE
		
		public void eliminarMaquinaRegistradora(int id);// Elimina el maquinaRegistradora DELETE
	
}


