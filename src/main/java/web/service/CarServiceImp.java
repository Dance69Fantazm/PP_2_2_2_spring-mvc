package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla Cybertruck", "Metallic", 2023));
        cars.add(new Car("Nissan", "Red", 2014));
        cars.add(new Car("Porsche", "Blue", 2024));
        cars.add(new Car("Ford", "Yellow", 1999));
        cars.add(new Car("Toyota", "Blue", 2006));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
