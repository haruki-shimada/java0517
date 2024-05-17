package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Occupant;

@Repository
public interface ApartmentRepository extends JpaRepository<Occupant, Integer> {
    public Optional<Occupant> findById(int id);
}
