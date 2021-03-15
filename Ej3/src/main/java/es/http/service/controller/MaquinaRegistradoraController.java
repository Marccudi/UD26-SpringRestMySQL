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

import es.http.service.dto.MaquinaRegistradora;
import es.http.service.service.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {
	
	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	@GetMapping("/maquinaRegistradoras")
	public List<MaquinaRegistradora> listarMaquinaRegistradoras(){
		return maquinaRegistradoraServiceImpl.listarMaquinaRegistradoras();
	}
	
	
	@PostMapping("/maquinaRegistradoras")
	public MaquinaRegistradora salvarMaquinaRegistradora(@RequestBody MaquinaRegistradora curso) {
		
		return maquinaRegistradoraServiceImpl.guardarMaquinaRegistradora(curso);
	}
	
	
	@GetMapping("/maquinaRegistradoras/{id}")
	public MaquinaRegistradora MaquinaRegistradoraXID(@PathVariable(name="id") int id) {
		
		MaquinaRegistradora MaquinaRegistradora_xid= new MaquinaRegistradora();
		
		MaquinaRegistradora_xid=maquinaRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
//		System.out.println("MaquinaRegistradora XID: "+MaquinaRegistradora_xid);
		
		return MaquinaRegistradora_xid;
	}
	
	@PutMapping("/maquinaRegistradora/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name="id")int id,@RequestBody MaquinaRegistradora MaquinaRegistradora) {
		
		MaquinaRegistradora MaquinaRegistradora_seleccionado= new MaquinaRegistradora();
		MaquinaRegistradora MaquinaRegistradora_actualizado= new MaquinaRegistradora();
		
		MaquinaRegistradora_seleccionado= maquinaRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
		MaquinaRegistradora_seleccionado.setPiso(MaquinaRegistradora.getPiso());

		
		MaquinaRegistradora_actualizado = maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(MaquinaRegistradora_seleccionado);
		
		System.out.println("El MaquinaRegistradora actualizado es: "+ MaquinaRegistradora_actualizado);
		
		return MaquinaRegistradora_actualizado;
	}
	
	@DeleteMapping("/maquinaRegistradora/{id}")
	public void eleiminarMaquinaRegistradora(@PathVariable(name="id")int id) {
		maquinaRegistradoraServiceImpl.eliminarMaquinaRegistradora(id);
	}
	
	
}
