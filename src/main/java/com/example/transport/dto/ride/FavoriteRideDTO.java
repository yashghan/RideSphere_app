package com.example.transport.dto.ride;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteRideDTO extends FavoriteRideWithoutIdDTO {
    private Integer id;

}
