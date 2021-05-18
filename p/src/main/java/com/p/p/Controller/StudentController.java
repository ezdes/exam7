package com.p.p.Controller;

import com.p.p.Entity.Student;
import com.p.p.Exception.ResourceNotFoundException;
import com.p.p.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) throws ResourceNotFoundException {
        return studentService.get(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("name/{name}")
    public List<Student> findByFullName(@PathVariable String name){
        return studentService.getByFullName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }
}
