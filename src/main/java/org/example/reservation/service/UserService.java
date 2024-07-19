package org.example.reservation.service;

import org.example.reservation.model.User;
import org.example.reservation.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UsersRepository userRepository;
    public List<User> retrieveUsers(){
        return (List<User>) this.userRepository.findAll();
    }

}
