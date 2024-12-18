package com.example.Voiture.service;

import com.example.Voiture.dto.CarDto;

import java.util.List;

public interface CarService {
    public CarDto saveCar(CarDto carDto);

    public List<CarDto> getByModel(String model);

    public  List<CarDto> saveCars(List<CarDto> carDtos);

}
