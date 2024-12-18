package com.example.Voiture.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CarDto {
    String model;
    String color;
    String matricul;
    double price;

}
