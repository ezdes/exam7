package com.p.p.Service;

import com.p.p.Entity.Course;
import com.p.p.Entity.Student;
import com.p.p.Exception.ResourceNotFoundException;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    Student get(Long id) throws ResourceNotFoundException;

    List<Student> getAll();

    void delete(Long id);

    List<Student> getByFullName(String name);
}
