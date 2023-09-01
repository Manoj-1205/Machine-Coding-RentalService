package com.machinecoding.carrentalsystem.models;

import com.machinecoding.carrentalsystem.enums.CarStatus;
import com.machinecoding.carrentalsystem.enums.CarType;
import com.machinecoding.carrentalsystem.enums.City;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Car extends BaseClass{
    private String Brand;
    private String name;
    private String Model;
    private City city;
    @Enumerated(EnumType.STRING)
    private CarType type;
    private Integer seatingCapacity;
    private Double mileage;
    private Double costPerHour;
    private CarStatus status;
}
