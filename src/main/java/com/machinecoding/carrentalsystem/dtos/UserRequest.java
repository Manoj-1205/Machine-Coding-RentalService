package com.machinecoding.carrentalsystem.dtos;

import com.machinecoding.carrentalsystem.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserRequest {
    private String name;
    private String email;
    private String phoneNo;

    public User toUser(){
        return User.builder()
                .name(name)
                .email(email)
                .phoneNo(phoneNo)
                .build();
    }
}
