package com.machinecoding.carrentalsystem.service;

import com.machinecoding.carrentalsystem.models.User;
import com.machinecoding.carrentalsystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }
}
