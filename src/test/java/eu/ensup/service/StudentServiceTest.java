package eu.ensup.service;

import eu.ensup.business.Role;
import eu.ensup.business.Student;
import eu.ensup.dto.StudentDTO;
import eu.ensup.mapper.StudentMapper;
import eu.ensup.repository.StudentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.event.annotation.PrepareTestInstance;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Spy
    private StudentRepository repository;

    private StudentDTO studentDTO;

    @Test
    void create() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(0L);
        studentDTO.setFirstname("toto");
        studentDTO.setLastname("tito");
        studentDTO.setAddress("12 toto chez tata");
        studentDTO.setEmail("grum@email.com");
        studentDTO.setPassword("123456789");
        studentDTO.setRole(Role.STUDENT);
        studentDTO.setTelephone("0102020203");
        studentDTO.setUniqueId("15az23er");
        studentDTO.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        StudentDTO retStudent = studentService.create(studentDTO);
        assertNotNull(retStudent);
        assertEquals(retStudent.getFirstname(), "toto");
        studentService.delete(retStudent);
    }

    @Test
    void update() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(0L);
        studentDTO.setFirstname("toto");
        studentDTO.setLastname("tito");
        studentDTO.setAddress("12 toto chez tata");
        studentDTO.setEmail("grum@email.com");
        studentDTO.setPassword("123456789");
        studentDTO.setRole(Role.STUDENT);
        studentDTO.setTelephone("0102020203");
        studentDTO.setUniqueId("15az23er");
        studentDTO.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        StudentDTO createdStudent = studentService.create(studentDTO);

        assertNotNull(createdStudent);
        createdStudent.setFirstname("OUBA");
        StudentDTO retStudent = studentService.update(createdStudent);
        assertNotNull(retStudent);

        assertEquals(retStudent.getFirstname(), "OUBA");
        studentService.delete(createdStudent);
    }

    @Test
    void get() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(0L);
        studentDTO.setFirstname("toto");
        studentDTO.setLastname("tito");
        studentDTO.setAddress("12 toto chez tata");
        studentDTO.setEmail("grum@email.com");
        studentDTO.setPassword("123456789");
        studentDTO.setRole(Role.STUDENT);
        studentDTO.setTelephone("0102020203");
        studentDTO.setUniqueId("15az23er");
        studentDTO.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        StudentDTO createdStudent = studentService.create(studentDTO);
        StudentDTO retStudent = studentService.get(createdStudent);
        assertNotNull(retStudent);
        assertEquals(retStudent.getFirstname(), "toto");
        studentService.delete(createdStudent);

    }

    @Test
    void getAll() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(0L);
        studentDTO.setFirstname("toto");
        studentDTO.setLastname("tito");
        studentDTO.setAddress("12 toto chez tata");
        studentDTO.setEmail("grum@email.com");
        studentDTO.setPassword("123456789");
        studentDTO.setRole(Role.STUDENT);
        studentDTO.setTelephone("0102020203");
        studentDTO.setUniqueId("15az23er");
        studentDTO.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        StudentDTO test1 = studentService.create(studentDTO);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(0L);
        studentDTO1.setFirstname("tata");
        studentDTO1.setLastname("tito");
        studentDTO1.setAddress("12 toto chez tata");
        studentDTO1.setEmail("grum@email.com");
        studentDTO1.setPassword("123456789");
        studentDTO1.setRole(Role.STUDENT);
        studentDTO1.setTelephone("0102020203");
        studentDTO1.setUniqueId("15az23er");
        studentDTO1.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        StudentDTO test2 = studentService.create(studentDTO1);

        List<StudentDTO> studentDTOList = studentService.getAll();
        assertEquals(studentDTOList.get(0).getFirstname(), "toto");
        assertEquals(studentDTOList.get(1).getFirstname(), "tata");
        assertEquals(studentDTOList.stream().count(), 2);

        studentService.delete(test1);
        studentService.delete(test2);
    }

    @Test
    void delete() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(0L);
        studentDTO.setFirstname("toto");
        studentDTO.setLastname("tito");
        studentDTO.setAddress("12 toto chez tata");
        studentDTO.setEmail("grum@email.com");
        studentDTO.setPassword("123456789");
        studentDTO.setRole(Role.STUDENT);
        studentDTO.setTelephone("0102020203");
        studentDTO.setUniqueId("15az23er");
        studentDTO.setDateOfBirth(LocalDateTime.of(1995,06,02,00,00));
        assertEquals(0,studentService.getAll().stream().count());
        StudentDTO studentDto = studentService.create(studentDTO);
        studentService.delete(studentDto);
        assertEquals(0,studentService.getAll().stream().count());

    }
}