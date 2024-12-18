
package com.example.Voiture.mapper;
import com.example.Voiture.dao.entities.Car;
import com.example.Voiture.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class carMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDto carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDto fromCarToCarDto(Car car){
        return mapper.map(car, CarDto.class);
    }
}
