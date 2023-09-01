package com.machinecoding.carrentalsystem.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseClass{
    private String name;
    private String email;
    private String phoneNo;

}
