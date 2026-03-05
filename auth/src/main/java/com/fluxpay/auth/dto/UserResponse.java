package com.fluxpay.auth.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {
   private String id;
   private String firstName;
   private String lastName;
   private String email;
   private String role;   
}
