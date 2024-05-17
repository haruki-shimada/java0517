package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.ApartmentInterface;
import com.example.demo.data.ApartmentService;

@RestController
public class ApartmentController {

    @Autowired
    ApartmentService service;

    @GetMapping("/apartments")
    @CrossOrigin
    public List<? extends ApartmentInterface> apartments() {
        System.out.println("/apartments");
        return service.getAll();
    }

    @GetMapping("/apartments/{id}")
    @CrossOrigin
    public ApartmentInterface apartmentById(@PathVariable int id) {
        System.out.println("/apartments/findById");
        return service.getById(id);
    }

}
