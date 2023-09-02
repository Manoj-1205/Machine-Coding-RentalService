package com.machinecoding.carrentalsystem.controller;

import com.machinecoding.carrentalsystem.dtos.UserRequest;
import com.machinecoding.carrentalsystem.models.User;
import com.machinecoding.carrentalsystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

public class UserController {
    private UserService userService;
    @PostMapping("/createUser")
    public User createUser(@RequestBody UserRequest request){
        return userService.createUser(request.toUser());
    }
}
