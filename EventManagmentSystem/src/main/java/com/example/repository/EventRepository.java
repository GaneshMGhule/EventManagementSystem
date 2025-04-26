package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	
}
