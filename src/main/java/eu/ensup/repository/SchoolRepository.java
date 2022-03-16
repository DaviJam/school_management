package eu.ensup.repository;

import eu.ensup.business.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface School repository.
 */
public interface SchoolRepository extends JpaRepository<School, Long> {
}
