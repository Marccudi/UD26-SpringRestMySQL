package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.http.service.dao.*;

import es.http.service.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService {
	
	@Autowired
	IAsignadoADAO IAsignadoADAO;

	@Override
	public List<AsignadoA> listarAsignadoA() {
		return IAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA proyecto) {
		return IAsignadoADAO.save(proyecto);
	}

	
	@Override
	public AsignadoA AsignadoAXID(String id) {
		return IAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA proyecto) {
		return IAsignadoADAO.save(proyecto);
	}

	@Override
	public void eliminarAsignadoA(String id) {
		IAsignadoADAO.deleteById(id);
	}

}
