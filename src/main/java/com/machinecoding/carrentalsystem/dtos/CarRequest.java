package com.machinecoding.carrentalsystem.dtos;

import com.machinecoding.carrentalsystem.enums.CarStatus;
import com.machinecoding.carrentalsystem.enums.CarType;
import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import lombok.Getter;

@Getter
public class CarRequest {
    private String brand;
    private String name;
    private String model;
    private City city;
    private CarType type;
    private Integer seatingCapacity;
    private Double costPerHour;
    private CarStatus status;
    public Car toCar(){
        return Car.builder()
                .brand(brand)
                .name(name)
                .model(model)
                .city(city)
                .type(type)
                .seatingCapacity(seatingCapacity)
                .costPerHour(costPerHour)
                .status(status)
                .build();
    }

}
