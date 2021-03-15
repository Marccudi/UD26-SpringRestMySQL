package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Proveedor;

/**
 * @author Jose
 *
 */
public interface IProveedorDAO extends JpaRepository<Proveedor, Integer>{
	
}
