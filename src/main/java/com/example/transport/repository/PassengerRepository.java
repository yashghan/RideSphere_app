package com.example.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.uns.ftn.transport.model.Passenger;

import java.util.Optional;


public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
    Optional<Passenger> findByEmail(String email);
}
