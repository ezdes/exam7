package com.example.demo.Controller;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Factory.Factory;
import com.example.demo.Model.AbstractSomething;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Factory factory;

    @GetMapping("/{code}")
    public AbstractSomething get(@PathVariable Integer code) throws ResourceNotFoundException {
        return factory.get(code);
    }
}
