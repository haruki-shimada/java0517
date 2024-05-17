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

    @GetMapping("/occupants")
    @CrossOrigin
    public List<? extends ApartmentInterface> occupant() {
        System.out.println("/occupants");
        return service.getAll();
    }

    @GetMapping("/occupants/{id}")
    @CrossOrigin
    public ApartmentInterface occupantById(@PathVariable int id) {
        System.out.println("/occupants/findById");
        return service.getById(id);
    }
}
