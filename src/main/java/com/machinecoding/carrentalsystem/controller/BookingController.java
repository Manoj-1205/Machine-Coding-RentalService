package com.machinecoding.carrentalsystem.controller;

import com.machinecoding.carrentalsystem.dtos.BookingRequest;
import com.machinecoding.carrentalsystem.dtos.BookingResponse;
import com.machinecoding.carrentalsystem.models.Booking;
import com.machinecoding.carrentalsystem.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
public class BookingController {
    private BookingService bookingService;
    @PostMapping("/book")
    public BookingResponse createBooking(@RequestBody BookingRequest request){
        return bookingService.createBooking(request);
    }

}
