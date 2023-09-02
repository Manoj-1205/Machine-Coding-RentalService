package com.machinecoding.carrentalsystem.service;

import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private CarRepository carRepository;
    public Car addCar(Car car){
        return carRepository.save(car);
    }

    public List<Car> findCarsByCity(City city){
        return carRepository.findAllByCity(city);
    }
}
