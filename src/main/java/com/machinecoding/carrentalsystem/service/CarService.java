package com.machinecoding.carrentalsystem.service;

import com.machinecoding.carrentalsystem.Exceptions.CarNotFoundException;
import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import com.machinecoding.carrentalsystem.repository.CarRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private CarRepository carRepository;



    @Transactional
    public Car addCar(Car car){
        Car fetchedCar = carRepository.save(car);

        throwUncheckedException();
        return fetchedCar;
    }

    public Car throwUncheckedException(){
        throw new RuntimeException("Generating custom RE");
    }

    public List<Car> findCarsByCity(City city){

        return carRepository.findAllByCity(city);
    }
    public Car findCarById(Long id){
        return carRepository.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found in the selected Location"));
    }
}
