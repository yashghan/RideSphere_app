package com.example.transport.dto.passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerPageDTO {

    public Long totalCount;
    public Set<PassengerCreatedDTO> results;
}
