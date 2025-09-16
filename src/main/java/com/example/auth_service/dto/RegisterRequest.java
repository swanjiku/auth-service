package com.example.auth_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class RegisterRequest {
    @Schema(example = "sophia", description = "Unique username for the user")
    private String username;

    @Schema(example = "password123", description = "Raw password for registration")
    private String password;

    @Schema(example = "USER", description = "Role assigned to the user (e.g. USER, ADMIN)")
    private String role;
}
