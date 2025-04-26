package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
	
}
