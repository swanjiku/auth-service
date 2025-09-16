package com.example.auth_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginRequest {
    @Schema(example = "sophia", description = "Username of the registered user")
    private String username;

    @Schema(example = "password123", description = "Password of the registered user")
    private String password;
}
