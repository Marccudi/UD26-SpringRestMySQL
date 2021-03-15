package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IPiezaDAO;
import es.http.service.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {
	
	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza curso) {
		return iPiezaDAO.save(curso);
	}

	@Override
	public Pieza piezaXID(int id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza curso) {
		return iPiezaDAO.save(curso);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezaDAO.deleteById(id);
	}

}
