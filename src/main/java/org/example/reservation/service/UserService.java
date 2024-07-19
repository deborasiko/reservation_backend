package org.example.reservation.service;

import org.example.reservation.model.User;
import org.example.reservation.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.example.Assignment.model.User;
//import com.example.Assignment.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//
@Service
public class UserService {
    @Autowired
    private UsersRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @Autowired
//    private EmailService emailService;
//
    public List<User> retrieveUsers(){
        return (List<User>) this.userRepository.findAll();
    }
//
//    public User retrieveUserById(Long id) {
//        Optional<User> user = this.userRepository.findById(id);
//        if (user.isPresent()) {
//            return user.get();
//        } else {
//            return null;
//        }
//    }
//    public Optional<User> findUserById(Long id){
//        return this.userRepository.findById(id);
//    }
//
//    public Optional<User> findUserByUserName(String username){
//        return this.userRepository.findByUserName(username);
//    }
//
//    public Optional<User> login(String username, String password) {
//        Optional<User> user = userRepository.findByUserName(username);
//        if (user.isPresent() /*&& passwordEncoder.matches(password, user.get().getPassword())*/) {
//            return user;
//        }
//        return Optional.empty();
//    }
//
//    public User addUser(User user){
//        User u = new User();
//        u.setUserName(user.getUserName());
//        u.setPassword(passwordEncoder.encode(user.getPassword()));
//        u.setScore(user.getScore());
//        u.setAdmin(user.isAdmin());
//        u.setBanned(user.isBanned());
//        return this.userRepository.save(u);
//    }
//
//    public String deleteUserById(Long id){
//        try{
//            this.userRepository.deleteById(id);
//            return "Entry successfully deleted!";
//        }catch (Exception e){
//            return "Failed to delete entry with id:" + id;
//        }
//    }
//
//
//    public boolean findByUserName(String username) {
//       List<User> users = (List<User>) this.userRepository.findAll();
//       for(User u : users){
//           if (u.getUserName().equals(username)){
//               return true;
//           }
//       }
//       return false;
//    }
//
//    public void banUser(User user){
//        user.setBanned(true);
//        userRepository.save(user);
//        emailService.sendEmail(user.getEmail(), "Banned", "You have been banned.");
//    }
//
//    public void unbanUser(User user) {
//        user.setBanned(false);
//        userRepository.save(user);
//    }
}
