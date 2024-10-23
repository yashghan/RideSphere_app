package com.example.transport.service.interfaces;

import rs.ac.uns.ftn.transport.model.FavoriteRide;

import java.util.Set;

public interface IFavoriteRideService {

    FavoriteRide save(FavoriteRide ride);
    void delete(Integer id);
    Set<FavoriteRide> findAll();
    Set<FavoriteRide> findAllByPassenger(Integer id);
}
