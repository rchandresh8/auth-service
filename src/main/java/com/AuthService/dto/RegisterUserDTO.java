package com.AuthService.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class RegisterUserDTO {
    private String email;

    private String password;

    private String fullName;
}
