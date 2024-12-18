package com.example.Voiture;

import com.example.Voiture.dto.CarDto;
import com.example.Voiture.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CarService carService) {
		return args -> {
			carService.saveCars(
					List.of(
							CarDto.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build(),
							CarDto.builder().model("model2").matricul("ef6e+6").color("green").price(65489).build(),
							CarDto.builder().model("model3").matricul("ef64we8").color("yellow").price(89789).build(),
							CarDto.builder().model("model4").matricul("wrdqwqw").color("black").price(67489).build()
					)
			);
		};
	}
}
