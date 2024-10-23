package com.example.transport.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Data
public class VehicleDTO {
    private Integer id;

    private Integer driverId;

    @NotBlank(message = "{required}")
    @Pattern(regexp = "STANDARD|LUKSUZNO|KOMBI", flags = Pattern.Flag.CASE_INSENSITIVE, message = "{format}")
    private String vehicleType;

    @NotBlank(message = "{required}")
    @Length(max = 100, message = "{maxLength}")
    private String model;

    @NotBlank(message = "{required}")
    @Length(max = 20, message = "{maxLength}")
    private String licenseNumber;

    private LocationDTO currentLocation;

    @NotNull(message = "{required}")
    @Min(1)
    @Max(20)
    private Integer passengerSeats;

    private Boolean babyTransport;

    private Boolean petTransport;
}
