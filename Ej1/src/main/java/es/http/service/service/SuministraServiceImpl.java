package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISuministraCursoDAO;
import es.http.service.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {
	
	@Autowired
	ISuministraCursoDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministra() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra curso) {
		return iSuministraDAO.save(curso);
	}

	@Override
	public Suministra suministraXID(int id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra curso) {
		return iSuministraDAO.save(curso);
	}

	@Override
	public void eliminarSuministra(int id) {
		iSuministraDAO.deleteById(id);
	}

}
