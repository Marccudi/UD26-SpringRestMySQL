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

import es.http.service.dto.Proveedor;
import es.http.service.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl ProveedorServiceImpl;
	
	@GetMapping("/Proveedors")
	public List<Proveedor> listarCProveedors(){
		return ProveedorServiceImpl.listarProveedors();
	}
	
	
	@PostMapping("/Proveedors")
	public Proveedor salvarProveedor(@RequestBody Proveedor Proveedor) {
		
		return ProveedorServiceImpl.guardarProveedor(Proveedor);
	}
	
	
	@GetMapping("/Proveedors/{id}")
	public Proveedor ProveedorXID(@PathVariable(name="id") int id) {
		
		Proveedor Proveedor_xid= new Proveedor();
		
		Proveedor_xid=ProveedorServiceImpl.proveedorXID(id);
		
		System.out.println("Proveedor XID: "+Proveedor_xid);
		
		return Proveedor_xid;
	}
	
	@PutMapping("/Proveedors/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")int id,@RequestBody Proveedor Proveedor) {
		
		Proveedor Proveedor_seleccionado= new Proveedor();
		Proveedor Proveedor_actualizado= new Proveedor();
		
		Proveedor_seleccionado= ProveedorServiceImpl.proveedorXID(id);
		
		Proveedor_seleccionado.setNombre(Proveedor.getNombre());
		
		Proveedor_actualizado = ProveedorServiceImpl.actualizarProveedor(Proveedor_seleccionado);
		
		System.out.println("El Proveedor actualizado es: "+ Proveedor_actualizado);
		
		return Proveedor_actualizado;
	}
	
	@DeleteMapping("/Proveedors/{id}")
	public void eleiminarProveedor(@PathVariable(name="id")int id) {
		ProveedorServiceImpl.eliminarProveedor(id);
	}
	
	
}
