package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars(List<Car> cars, int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
