package eu.ensup.service;


import eu.ensup.business.Student;
import eu.ensup.dto.StudentDTO;
import eu.ensup.mapper.StudentMapper;
import eu.ensup.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Student service.
 */
@Service
public class StudentService implements UserService<StudentDTO> {
    @Autowired
    private StudentRepository repository;

    /**
     * Instantiates a new Student service.
     *
     * @param repository the repository
     */
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentDTO create(StudentDTO personDTO) {
        return StudentMapper.businessToDto(repository.save(StudentMapper.dtoToBusiness(personDTO)));
    }

    @Override
    public StudentDTO update(StudentDTO personDTO) {
        return StudentMapper.businessToDto(repository.save(StudentMapper.dtoToBusiness(personDTO)));
    }

    @Override
    public StudentDTO get(StudentDTO personDTO) {
        return StudentMapper.businessToDto(repository.findByUniqueId(personDTO.getUniqueId()));
    }

    @Override
    public List<StudentDTO> getAll() {
        return repository.findAll().stream().map(student -> StudentMapper.businessToDto(student)).collect(Collectors.toList());
    }

    @Override
    public void delete(StudentDTO personDTO) {
        repository.delete(StudentMapper.dtoToBusiness(personDTO));
    }
}
