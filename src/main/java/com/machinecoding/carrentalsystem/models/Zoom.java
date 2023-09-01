package com.machinecoding.carrentalsystem.models;

import com.machinecoding.carrentalsystem.enums.City;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;


@Entity
public class Zoom extends BaseClass{
    @Enumerated(EnumType.STRING)
    private List<City> cities=new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    private List<Car> cars=new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    private List<User> users=new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    private List<Booking> bookings=new ArrayList<>();
}
