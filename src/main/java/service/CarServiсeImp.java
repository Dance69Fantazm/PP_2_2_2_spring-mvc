package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiсeImp implements CarService {

    private final List<Car> cars = List.of(
            new Car("Tesla Cybertruck", "Metallic", 2023),
            new Car("Nissan", "Red", 2014),
            new Car("Porsche", "Blue", 2024),
            new Car("Ford", "Yellow", 1999),
            new Car("Toyota", "Blue", 2006)
    );

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> listCars(List<Car> cars, int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
