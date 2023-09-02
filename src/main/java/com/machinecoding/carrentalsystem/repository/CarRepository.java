package com.machinecoding.carrentalsystem.repository;

import com.machinecoding.carrentalsystem.enums.City;
import com.machinecoding.carrentalsystem.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByCity(City city);
}
