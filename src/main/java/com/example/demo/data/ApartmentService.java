package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Apartment;
import com.example.demo.repositories.ApartmentRepository;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository repository;

    public List<? extends ApartmentInterface> getAll() {
        System.out.println("Service:getAll");
        return repository.findAll();
    }

    public ApartmentInterface getById(int id) {
        System.out.println("Service:getById[" + id + "]");
        return repository.findById(id).orElse(null);
    }

    public ApartmentInterface create(Apartment apart) {
        System.out.println("Service:create");
        return repository.save(apart);
    }

    public void deleteById(int id) {
        System.out.println("Service:delete");
        repository.deleteById(id);
        return;
    }
}
