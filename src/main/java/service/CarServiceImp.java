package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

/*    @Override
    public List<Car> getCars() {
        return Arrays.asList(
                new Car("Tesla Cybertruck", "Metallic", 2023),
                new Car("Nissan", "Red", 2014),
                new Car("Porsche", "Blue", 2024),
                new Car("Ford", "Yellow", 1999),
                new Car("Toyota", "Blue", 2006)
        );
    }*/

    @Override
    public List<Car> listCars(List<Car> cars, int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}

/*@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    // Предопределённый список машин
    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla Cybertruck", "Metallic", 2023));
        cars.add(new Car("Nissan", "Red", 2014));
        cars.add(new Car("Porsche", "Blue", 2024));
        cars.add(new Car("Ford", "Yellow", 1999));
        cars.add(new Car("Toyota", "Blue", 2006));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}*/
