package eu.ensup.repository;

import eu.ensup.business.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Manager repository.
 */
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
