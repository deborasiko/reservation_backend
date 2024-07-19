package org.example.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservations {
    public Reservations() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userid;
    private Long roomid;

    public Long getId() {
        return id;
    }

    public Long getUserid() {
        return userid;
    }

    public Long getRoomid() {
        return roomid;
    }
}
