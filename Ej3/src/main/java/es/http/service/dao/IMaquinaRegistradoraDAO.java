package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.MaquinaRegistradora;

/**
 * @author Jose
 *
 */
public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Integer>{
	
}
