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

import es.http.service.dto.AsignadoA;
import es.http.service.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	
	@Autowired
	AsignadoAServiceImpl AsignadoAServiceImpl;
	
	@GetMapping("/AsignadoAs")
	public List<AsignadoA> listarAsignadoA(){
		return AsignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/AsignadoAs")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA AsignadoA) {
		
		return AsignadoAServiceImpl.guardarAsignadoA(AsignadoA);
	}
	
	
	@GetMapping("/AsignadoAs/{id}")
	public AsignadoA AsignadoAXID(@PathVariable(name="id") String id) {
		
		AsignadoA AsignadoA_xid= new AsignadoA();
		
		AsignadoA_xid=AsignadoAServiceImpl.AsignadoAXID(id);
		
		System.out.println("AsignadoA XID: "+AsignadoA_xid);
		
		return AsignadoA_xid;
	}
	
	@PutMapping("/AsignadoA/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")String id,@RequestBody AsignadoA AsignadoA) {
		
		AsignadoA AsignadoA_seleccionado= new AsignadoA();
		AsignadoA AsignadoA_actualizado= new AsignadoA();
		
		AsignadoA_seleccionado= AsignadoAServiceImpl.AsignadoAXID(id);
		
		
		AsignadoA_seleccionado.setProyecto(AsignadoA.getProyecto());
		AsignadoA_seleccionado.setCientifico(AsignadoA.getCientifico());
		
		
		
		AsignadoA_actualizado =	AsignadoAServiceImpl.actualizarAsignadoA(AsignadoA_seleccionado);
		
		System.out.println("El AsignadoA actualizado es: "+ AsignadoA_actualizado);
		
		return AsignadoA_actualizado;
	}
	
	@DeleteMapping("/AsignadoAs/{id}")
	public void eleiminarAsignadoA(@PathVariable(name="id")String id) {
		AsignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
	
}
