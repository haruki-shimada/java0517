package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.ApartmentInterface;
import com.example.demo.data.ApartmentService;
import com.example.demo.model.Apartment;

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

    @PostMapping("/apartments/create")
    @CrossOrigin
    public ApartmentInterface createApartment(Apartment apart) {
        System.out.println("/apartments/create");
        return service.create(apart);
    }

    @PostMapping("/apartments/{id}/delete")
    @CrossOrigin
    public void deleteApartment(@PathVariable int id) {
        System.out.println("/apartments/id/delete");
        service.deleteById(id);
        return;
    }

    @PostMapping("/apartments/{id}/update")
    @CrossOrigin
    public ApartmentInterface updateApartment(Apartment apart) {
        System.out.println("/apartments/update");
        if (service.getById(apart.getId()) != null) {
            service.create(apart);
        } else {
            throw new Error("ID not found");
        }
        return apart;
    }
}
