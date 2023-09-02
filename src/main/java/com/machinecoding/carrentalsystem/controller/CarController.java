package com.machinecoding.carrentalsystem.controller;

import com.machinecoding.carrentalsystem.dtos.CarRequest;
import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.service.CarService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {
    private CarService carService;
    @PostMapping("/addCar")
    public Car addCar(@RequestBody  CarRequest request){
        Car car = request.toCar();
        return carService.addCar(car);
    }

    @GetMapping("/{city}/getCars")
    public List<Car> findCarsByCity(@PathVariable City city){
        return carService.findCarsByCity(city);
    }
}
