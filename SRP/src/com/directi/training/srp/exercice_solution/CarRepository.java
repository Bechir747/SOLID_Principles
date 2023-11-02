package com.directi.training.srp.exercice_solution;

import java.util.List;
import java.util.Arrays;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        // Initialize the list of cars
        cars = Arrays.asList(
                new Car("1", "Golf III", "Volkswagen"),
                new Car("2", "Multipla", "Fiat"),
                new Car("3", "Megane", "Renault")
        );
    }

    public Car getFromDb(String carId) {
        for (Car car : cars) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return null;
    }
}