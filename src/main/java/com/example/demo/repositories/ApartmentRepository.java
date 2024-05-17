package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
    public Optional<Apartment> findById(int id);
}
