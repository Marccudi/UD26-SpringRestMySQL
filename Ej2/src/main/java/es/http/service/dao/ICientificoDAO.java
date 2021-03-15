package es.http.service.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cientifico;

/**
 * @author Jose
 *
 */
public interface ICientificoDAO extends JpaRepository<Cientifico, String>{


}
