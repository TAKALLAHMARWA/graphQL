package com.example.Voiture.dao.repositories;

import com.example.Voiture.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    public List<Car> findByModel(String model);


}
