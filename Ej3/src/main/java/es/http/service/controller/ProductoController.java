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

import es.http.service.dto.Producto;
import es.http.service.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl ProductoServiceImpl;
	
	@GetMapping("/Productos")
	public List<Producto> listarProductos(){
		return ProductoServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/Productos")
	public Producto salvarProducto(@RequestBody Producto Producto) {
		
		return ProductoServiceImpl.guardarProducto(Producto);
	}
	
	
	@GetMapping("/Productos/{id}")
	public Producto ProductoXID(@PathVariable(name="id") int id) {
		
		Producto Producto_xid= new Producto();
		
		Producto_xid=ProductoServiceImpl.productoXID(id);
		
//		System.out.println("Producto XID: "+Producto_xid);
		
		return Producto_xid;
	}
	
	@PutMapping("/Productos/{id}")
	public Producto actualizarProducto(@PathVariable(name="id")int id,@RequestBody Producto Producto) {
		
		Producto Producto_seleccionado= new Producto();
		Producto Producto_actualizado= new Producto();
		
		Producto_seleccionado= ProductoServiceImpl.productoXID(id);
		
		Producto_seleccionado.setNombre(Producto.getNombre());
		Producto_seleccionado.setPrecio(Producto.getPrecio());
		
		Producto_actualizado = ProductoServiceImpl.actualizarProducto(Producto_seleccionado);
		
//		System.out.println("El Producto actualizado es: "+ Producto_actualizado);
		
		return Producto_actualizado;
	}
	
	@DeleteMapping("/Productos/{id}")
	public void eleiminarProducto(@PathVariable(name="id")int id) {
		ProductoServiceImpl.eliminarProducto(id);
	}
	
	
}
