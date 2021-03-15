package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Suministra;
import es.http.service.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministroController {
	
	@Autowired
	SuministraServiceImpl suministroServiceImpl;
	
	@GetMapping("/suministros")
	public List<Suministra> listarSuministro(){
		return suministroServiceImpl.listarSuministra();
	}
	
	
	@PostMapping("/suministros")
	public Suministra salvarSuministro(@RequestBody Suministra suministro) {
		
		return suministroServiceImpl.guardarSuministra(suministro);
	}
	
	
	@GetMapping("/suministros/{id}")
	public Suministra SuministroXID(@PathVariable(name="id") int id) {
		
		Suministra Suministro_xid= new Suministra();
		
		Suministro_xid=suministroServiceImpl.suministraXID(id);
		
		System.out.println("Suministro XID: "+Suministro_xid);
		
		return Suministro_xid;
	}
	
	@PutMapping("/suministros/{id}")
	public Suministra actualizarSuministro(@PathVariable(name="id")int id,@RequestBody Suministra Suministro) {
		
		Suministra Suministro_seleccionado= new Suministra();
		Suministra Suministro_actualizado= new Suministra();
		
		Suministro_seleccionado= suministroServiceImpl.suministraXID(id);
		
		Suministro_seleccionado.setCodigopieza(Suministro.getCodigopieza());
		Suministro_seleccionado.setProveedorid(Suministro.getProveedorid());
		
		
		Suministro_actualizado = suministroServiceImpl.actualizarSuministra(Suministro_seleccionado);
		
		System.out.println("El Suministro actualizado es: "+ Suministro_actualizado);
		
		return Suministro_actualizado;
	}
	
	@DeleteMapping("/suministros/{id}")
	public void eleiminarSuministro(@PathVariable(name="id")int id) {
		suministroServiceImpl.eliminarSuministra(id);
	}
	
	
}
