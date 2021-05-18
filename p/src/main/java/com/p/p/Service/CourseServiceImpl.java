package com.p.p.Service;

import com.p.p.Entity.Course;
import com.p.p.Exception.ResourceNotFoundException;
import com.p.p.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course get(Long id) throws ResourceNotFoundException {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Couldn't find course with id ", id));
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}
