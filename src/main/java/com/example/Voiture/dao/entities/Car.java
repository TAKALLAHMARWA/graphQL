package com.example.Voiture.dao.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {
    @Id
    @GeneratedValue
    Long id;
    String model;
    String color;
    String matricul;
    double price;
}
