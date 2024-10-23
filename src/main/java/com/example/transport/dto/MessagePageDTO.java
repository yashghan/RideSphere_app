package com.example.transport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessagePageDTO {
    public Long totalCount;
    public Set<MessageDTO> results;
}
