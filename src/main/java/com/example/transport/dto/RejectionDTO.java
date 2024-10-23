package com.example.transport.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RejectionDTO {

    private String reason;
    private LocalDateTime timeOfRejection;
}
