package com.machinecoding.carrentalsystem.dtos;

import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Booking;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.models.User;
import lombok.Getter;

import java.awt.print.Book;
import java.time.LocalDateTime;

@Getter
public class BookingRequest {
    private Long userId;
    private City city;
    private Long carId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;



}
