package com.example.transport.dto;

import com.example.transport.model.Message;
import com.example.transport.model.Ride;
import com.example.transport.model.User;
import com.example.transport.model.enumerations.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
    private Integer id;
    private User sender;
    private User receiver;
    private String message;
    private LocalDateTime sentDateTime;
    private MessageType messageType;
    private Ride ride;

    public MessageDTO(Message message) {
        this.id = message.getId();
        this.sender = message.getSender();
        this.receiver = message.getReceiver();
        this.message = message.getMessage();
        this.sentDateTime = message.getSentDateTime();
        this.messageType = message.getMessageType();
        this.ride = message.getRide();
    }
}
