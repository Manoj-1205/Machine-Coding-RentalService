package com.machinecoding.carrentalsystem.models;

import com.machinecoding.carrentalsystem.enums.CarStatus;
import com.machinecoding.carrentalsystem.enums.CarType;
import com.machinecoding.carrentalsystem.enums.City;
import jakarta.persistence.Column;
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
    private String brand;
    private String name;
    private String model;
    @Enumerated(EnumType.STRING)
    private City city;

    @Enumerated(EnumType.STRING)
//    @Column(columnDefinition = "VARCHAR")
    private CarType type;
    private Integer seatingCapacity;

    private Double costPerHour;
    @Enumerated(EnumType.STRING)
    private CarStatus status;
}
