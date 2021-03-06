package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IVentaDAO;
import es.http.service.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta Venta) {
		return iVentaDAO.save(Venta);
	}

	@Override
	public Venta VentaXID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta curso) {
		return iVentaDAO.save(curso);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);
	}

}
