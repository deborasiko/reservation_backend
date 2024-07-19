package org.example.reservation.controller;

import org.example.reservation.model.Rooms;
import org.example.reservation.repository.RoomsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/rooms"})
@CrossOrigin(origins = {"http://localhost:8080", "http://127.0.0.1:8080", "http://localhost:4200"
        }, maxAge = 3600)
public class RoomsController {

    private final RoomsRepository roomsRepository;

    public RoomsController(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }

    @RequestMapping("/helloRooms")
    public String hello(){
        return "Rooms hello";
    }

    @RequestMapping("/goodbyeRooms")
    public String goodbye(){
        return "goodbye rooms";
    }

    @GetMapping(path = "/findall")
    public ResponseEntity<List<Rooms>> getAllRooms() {
        return ResponseEntity.ok(roomsRepository.findAll());
    }
}
