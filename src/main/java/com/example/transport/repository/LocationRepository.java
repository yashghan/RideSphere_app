package com.example.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.uns.ftn.transport.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}