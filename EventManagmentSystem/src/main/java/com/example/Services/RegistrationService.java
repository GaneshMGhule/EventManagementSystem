package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Registration;
import com.example.repository.RegistrationRepository;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration registerForEvent(Registration registration) {
        return registrationRepository.save(registration);
    }
}