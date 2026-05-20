package com.azzeddine.productapi.controller;

import com.azzeddine.productapi.dto.AuthRegisterRequest;
import com.azzeddine.productapi.dto.AuthResponse;
import com.azzeddine.productapi.dto.AuthLoginRequest;
import com.azzeddine.productapi.dto.JwtResponse;
import com.azzeddine.productapi.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@Valid @RequestBody AuthRegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public JwtResponse login(@Valid @RequestBody AuthLoginRequest request) {
        return authService.login(request);
    }
}