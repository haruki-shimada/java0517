package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositories.ApartmentRepository;

public class ApartmentService {
    @Autowired
    private ApartmentRepository repository;

    public List<? extends ApartmentInterface> getAll() {
        System.out.println("Service:getAll");
        return repository.findAll();
    }

    public ApartmentInterface getById(int id) {
        System.out.println("Service:getById[" + id + "]");
        return repository.findById.orElse(null);
    }
}
