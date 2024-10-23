package com.example.transport.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RejectionReasonDTO {
    @Length(max = 500,message = "{maxLength}")
    @NotBlank(message = "{required}")
    private String reason;
}
