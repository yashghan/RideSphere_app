package com.example.transport.dto.ride;

import lombok.Data;

@Data
public class IncomingRideSimulationDTO {
    private int driverId;
    private double latitude;
    private double longitude;
}
