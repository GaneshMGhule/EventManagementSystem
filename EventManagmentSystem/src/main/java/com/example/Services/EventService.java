package com.example.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Event;
import com.example.repository.EventRepository;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event event) throws Exception {
        // Check if the event exists
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            // Update the existing event's details
            Event updatedEvent = existingEvent.get();
            updatedEvent.setName(event.getName());
            updatedEvent.setDescription(event.getDescription());
            updatedEvent.setDate(event.getDate());
            updatedEvent.setLocation(event.getLocation());
            updatedEvent.setCategory(event.getCategory());
            return eventRepository.save(updatedEvent);
        } else {
            throw new Exception("Event not found with id " + id);
        }
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}