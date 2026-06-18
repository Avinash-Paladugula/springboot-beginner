package com.being_infinity.Springboot_beginner.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.being_infinity.Springboot_beginner.models.User;
import com.being_infinity.Springboot_beginner.services.UserService;

// import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping    
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User res = userService.getUserById(id);
        if(res==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(res);
        // return userService.getUserById(id);
    }

    @PostMapping
    public User addNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }
}
