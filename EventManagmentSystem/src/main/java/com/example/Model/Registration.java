package com.example.Model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long eventId; // Reference to the event
    private String attendeeName; // Name of the attendee
    private String attendeeEmail; // Email of the attendee
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration( Long eventId, String attendeeName, String attendeeEmail) {
		
		this.eventId = eventId;
		this.attendeeName = attendeeName;
		this.attendeeEmail = attendeeEmail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getAttendeeName() {
		return attendeeName;
	}
	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}
	public String getAttendeeEmail() {
		return attendeeEmail;
	}
	public void setAttendeeEmail(String attendeeEmail) {
		this.attendeeEmail = attendeeEmail;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", eventId=" + eventId + ", attendeeName=" + attendeeName + ", attendeeEmail="
				+ attendeeEmail + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(attendeeEmail, attendeeName, eventId, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(attendeeEmail, other.attendeeEmail) && Objects.equals(attendeeName, other.attendeeName)
				&& Objects.equals(eventId, other.eventId) && Objects.equals(id, other.id);
	}
    
    
}
