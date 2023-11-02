package com.directi.training.srp.exercice_solution;


import java.util.List;

public class CarManager {
    private CarRepository carRepository;
    private CarInformationProcessor carInformationProcessor;

    public CarManager(CarRepository carRepository, CarInformationProcessor carInformationProcessor) {
        this.carRepository = carRepository;
        this.carInformationProcessor = carInformationProcessor;
    }

    public Car getCarById(String carId) {
        return carRepository.getFromDb(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carRepository.getAllCars();
        return carInformationProcessor.getCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carInformationProcessor.getBestCar(cars);
    }
}
