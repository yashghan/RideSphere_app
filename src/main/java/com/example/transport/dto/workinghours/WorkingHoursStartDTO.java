package com.example.transport.dto.workinghours;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class WorkingHoursStartDTO {
    @NotNull
    private LocalDateTime start;
}