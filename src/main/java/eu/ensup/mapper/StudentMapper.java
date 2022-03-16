package eu.ensup.mapper;

import eu.ensup.business.Student;
import eu.ensup.dto.PersonDTO;
import eu.ensup.dto.StudentDTO;

/**
 * The type Student mapper.
 */
public class StudentMapper {
    /**
     * Dto to business student.
     *
     * @param studentDTO the student dto
     * @return the student
     */
    public static Student dtoToBusiness(StudentDTO studentDTO) {
        Student student = new Student();
        student.setPassword(studentDTO.getPassword());
        student.setFirstname(studentDTO.getFirstname());
        student.setLastname(studentDTO.getLastname());
        student.setAddress(studentDTO.getAddress());
        student.setEmail(studentDTO.getEmail());
        student.setId(studentDTO.getId());
        student.setRole(studentDTO.getRole());
        student.setTelephone(studentDTO.getTelephone());
        student.setUniqueId(studentDTO.getUniqueId());
        student.setDateOfBirth(studentDTO.getDateOfBirth());
        return student;
    }

    /**
     * Business to dto student dto.
     *
     * @param student the student
     * @return the student dto
     */
    public static StudentDTO businessToDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstname(student.getFirstname());
        studentDTO.setLastname(student.getLastname());
        studentDTO.setAddress(student.getAddress());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setRole(student.getRole());
        studentDTO.setTelephone(student.getTelephone());
        studentDTO.setUniqueId(student.getUniqueId());
        studentDTO.setDateOfBirth(student.getDateOfBirth());
        return studentDTO;
    }
}
