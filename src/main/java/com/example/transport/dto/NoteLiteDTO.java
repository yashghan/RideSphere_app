package com.example.transport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.ac.uns.ftn.transport.model.Note;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteLiteDTO {
    private Integer id;
    private String message;
    private LocalDateTime date;

    public NoteLiteDTO(Note note) {
        this.id = note.getId();
        this.message = note.getMessage();
        this.date = note.getDate();
    }
}
