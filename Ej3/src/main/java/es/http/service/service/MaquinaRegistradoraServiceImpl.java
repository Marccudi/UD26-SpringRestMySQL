package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMaquinaRegistradoraDAO;
import es.http.service.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {
	
	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradoras() {
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora curso) {
		return iMaquinaRegistradoraDAO.save(curso);
	}

	@Override
	public MaquinaRegistradora maquinaRegistradoraXID(int id) {
		return iMaquinaRegistradoraDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora curso) {
		return iMaquinaRegistradoraDAO.save(curso);
	}

	@Override
	public void eliminarMaquinaRegistradora(int id) {
		iMaquinaRegistradoraDAO.deleteById(id);
	}

}
