package es.http.service.service;

import java.util.List;

import es.http.service.dto.AsignadoA;

public interface IAsignadoAService {

	//Metodos del CRUD
		public List<AsignadoA> listarAsignadoA(); //Listar All 
		
		public AsignadoA guardarAsignadoA(AsignadoA AsignadoA);	//Guarda un AsignadoA CREATE
		
		public AsignadoA AsignadoAXID(String id); //Leer datos de un AsignadoA READ
		
		public AsignadoA actualizarAsignadoA(AsignadoA AsignadoA); //Actualiza datos del AsignadoA UPDATE
		
		public void eliminarAsignadoA(String id);// Elimina el AsignadoA DELETE

		
	
}


