package com.fluxpay.auth.service;

import com.fluxpay.auth.dto.AuthResponse;
import com.fluxpay.auth.dto.LoginRequest;
import com.fluxpay.auth.dto.RegisterRequest;

public interface AuthService {
   AuthResponse registerUser(RegisterRequest request);
   AuthResponse loginUser(LoginRequest request);    
}
