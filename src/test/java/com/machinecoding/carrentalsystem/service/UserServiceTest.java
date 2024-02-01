package com.machinecoding.carrentalsystem.service;

import com.machinecoding.carrentalsystem.Exceptions.UserNotFoundException;
import com.machinecoding.carrentalsystem.repository.UserRepository;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @InjectMocks
    private UserService userService;
    @Mock
    private UserRepository userRepository;


    @Test
    public void testFindByUserId(){
        when(userRepository.findById(any())).thenThrow(new UserNotFoundException("User Not Found!"));

        assertThatCode(() -> userService.findUser(5L)).isInstanceOf(UserNotFoundException.class);

    }

}