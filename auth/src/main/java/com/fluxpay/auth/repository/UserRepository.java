package com.fluxpay.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluxpay.auth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    Optional<User>findByEmail(String email);

    Boolean existsByEmail(String email);
    
}
