package com.bsanju.restapi.controller;

import com.bsanju.restapi.model.User;
import com.bsanju.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String homePage() {
        return "Hello World";
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        if (user.getName() == null || user.getEmail() == null) {
            throw new IllegalArgumentException("Name and Email cannot be null");
        }
        return userRepository.save(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User userDetails) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userDetails.getName());
                    user.setEmail(userDetails.getEmail());
                    return userRepository.save(user);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        if (!userRepository.existsById(id)) {
            return "User not found!";
        }
        userRepository.deleteById(id);
        return "User deleted with ID: " + id;
    }
}
