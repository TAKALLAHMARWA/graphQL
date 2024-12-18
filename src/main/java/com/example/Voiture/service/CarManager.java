package com.example.Voiture.service;

import com.example.Voiture.dao.entities.Car;
import com.example.Voiture.dao.repositories.CarRepository;
import com.example.Voiture.dto.CarDto;
import com.example.Voiture.mapper.carMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final carMapper carMapper; // Utilisez une instance injectée

    @Autowired
    public CarManager(CarRepository carRepository, carMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public CarDto saveCar(CarDto carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto); // Utilisez l'instance injectée
        car = carRepository.save(car);
        return carMapper.fromCarToCarDto(car);
    }

    @Override
    public List<CarDto> getByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }

    @Override
    public List<CarDto> saveCars(List<CarDto> carDtos) {
        List<Car> cars = new ArrayList<>();
        for (CarDto carDto : carDtos) {
            cars.add(carMapper.fromCarDtoToCar(carDto));
        }

        cars = carRepository.saveAll(cars);

        List<CarDto> savedCarDtos = new ArrayList<>();
        for (Car car : cars) {
            savedCarDtos.add(carMapper.fromCarToCarDto(car));
        }
        return savedCarDtos;
    }
}
