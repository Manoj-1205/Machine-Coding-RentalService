package com.machinecoding.carrentalsystem.service;

import com.machinecoding.carrentalsystem.Exceptions.CarAlreadyBookedException;
import com.machinecoding.carrentalsystem.Exceptions.CarNotFoundException;
import com.machinecoding.carrentalsystem.dtos.BookingRequest;
import com.machinecoding.carrentalsystem.dtos.BookingResponse;
import com.machinecoding.carrentalsystem.enums.BookingStatus;
import com.machinecoding.carrentalsystem.enums.CarStatus;
import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Booking;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.models.User;
import com.machinecoding.carrentalsystem.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookingService {
    private BookingRepository bookingRepository;
    private CarService carService;
    private UserService userService;
    public BookingResponse createBooking(BookingRequest request){
        City city = request.getCity();
        List<Car> carList = carService.findCarsByCity(city);
        Car car = carService.findCarById(request.getCarId());
        if(!carList.contains(car)){
            throw new CarNotFoundException("Car Not Found in the given location");
        }
        if(car.getStatus() == CarStatus.BOOKED){
            throw new CarAlreadyBookedException("Car already Booked. Please select another car");
        }
        User user = userService.findUser(request.getUserId());
        Booking booking = Booking.builder()
                .location(city)
                .cars(new ArrayList<>())
                .user(user)
                .startTime(request.getStartTime())
                .endTime(request.getEndTime())
                .build();
        bookingRepository.save(booking);
        booking.getCars().add(car);
        car.setStatus(CarStatus.BOOKED);
        carService.addCar(car);
        System.out.println("Car ADDED");
        bookingRepository.save(booking);

//        Integer totalCost = priceCalculation(request.getStartTime(), request.getEndTime(), car.getCostPerHour());
        return new BookingResponse();
//                BookingResponse.builder()
//                .city(request.getCity())
//                .userId(request.getUserId())
//                .carId(request.getCarId())
//                .startTime(request.getStartTime())
//                .endTime(request.getEndTime())
//                .totalCost(null)
//                .status(BookingStatus.CONFIRMED)
//                .build();

    }

    private Integer priceCalculation(LocalDateTime startTime, LocalDateTime endTime, Double costPerHour){
        Duration duration = Duration.between(startTime, endTime);
        int totalHours = (int)duration.toHours();
        return costPerHour.intValue() * totalHours;

    }
}
