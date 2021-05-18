package com.p.p.Controller;

import com.p.p.Entity.Course;
import com.p.p.Exception.ResourceNotFoundException;
import com.p.p.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public List<Course> findAll() {
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public Course findById(@PathVariable Long id) throws ResourceNotFoundException {
        return courseService.get(id);
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Long courseId) {
        courseService.delete(courseId);
    }

}
