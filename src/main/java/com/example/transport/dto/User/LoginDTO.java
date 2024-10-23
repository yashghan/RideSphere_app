package com.example.transport.dto.User;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginDTO {
    private String email;
    private String password;
}
