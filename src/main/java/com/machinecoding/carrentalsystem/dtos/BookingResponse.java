package com.machinecoding.carrentalsystem.dtos;

import com.machinecoding.carrentalsystem.enums.BookingStatus;
import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long userId;
    private City city;
    private Long carId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double totalCost;
    private BookingStatus status;
}
