package org.example.reservation.controller;

import org.example.reservation.model.Reservations;
import org.example.reservation.repository.ReservationsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/reservations"})
public class ReservationController {

    private final ReservationsRepository reservationsRepository;

    public ReservationController(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Reservation started";
    }

    @RequestMapping("/goodbye")
    public String goodbye(){
        return "goodbye reservation";
    }
    @GetMapping(path = "/findall")
    public ResponseEntity<List<Reservations>> getAllReservations() {
        return ResponseEntity.ok(reservationsRepository.findAll());
    }
}
