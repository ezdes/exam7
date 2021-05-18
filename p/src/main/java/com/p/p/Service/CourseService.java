package com.p.p.Service;

import com.p.p.Entity.Course;
import com.p.p.Exception.ResourceNotFoundException;

import java.util.List;

public interface CourseService {
    Course save(Course course);

    Course get(Long id) throws ResourceNotFoundException;

    List<Course> getAll();

    void delete(Long id);
}
