package eu.ensup.repository;

import eu.ensup.business.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Director repository.
 */
public interface DirectorRepository extends JpaRepository<Student, Long> {
}
