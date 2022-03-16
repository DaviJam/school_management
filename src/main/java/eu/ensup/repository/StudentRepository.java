package eu.ensup.repository;

import eu.ensup.business.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Student repository.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    /**
     * Find by unique id student.
     *
     * @param uniqueId the unique id
     * @return the student
     */
    Student findByUniqueId(String uniqueId);
}
