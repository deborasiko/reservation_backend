package org.example.reservation.controller;

import org.example.reservation.model.User;
import org.example.reservation.repository.UsersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/users"})
public class UserController {
    private final UsersRepository userRepository;

    public UserController(UsersRepository ur) {
        this.userRepository = ur;
    }
    @RequestMapping("/helloUser")
    public String helloUser(){
        return "Hello User";
    }

    @RequestMapping("/goodbyeUser")
    public String goodbye(){
        return "goodbye user";
    }
    @GetMapping(path = "/findall")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

}
