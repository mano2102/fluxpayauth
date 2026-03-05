package com.fluxpay.auth.service.impl;

import org.springframework.stereotype.Service;

import com.fluxpay.auth.dto.AuthResponse;
import com.fluxpay.auth.dto.LoginRequest;
import com.fluxpay.auth.dto.RegisterRequest;
import com.fluxpay.auth.entity.User;
import com.fluxpay.auth.repository.UserRepository;
import com.fluxpay.auth.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public AuthResponse registerUser(RegisterRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.save(user);
        return AuthResponse.builder().accessToken("dummy-token").refreshToken("dummy").tokenType("Bearer").build();
    }

    @Override
    public AuthResponse loginUser(LoginRequest request) {
        // Logic will be implemented after spring security

        return AuthResponse.builder().accessToken("dummy-token").refreshToken("dummy").tokenType("Bearer").build();
    }

}
