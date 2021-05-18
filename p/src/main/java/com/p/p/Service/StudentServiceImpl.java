package com.p.p.Service;

import com.p.p.Entity.Student;
import com.p.p.Exception.ResourceNotFoundException;
import com.p.p.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        student.setRegistrationDate(LocalDateTime.now());
        return studentRepository.save(student);
    }

    @Override
    public Student get(Long id) throws ResourceNotFoundException {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Couldn't find student with id ", id));
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getByFullName(String name) {
        return studentRepository.findStudentByFullName(name);
    }
}
