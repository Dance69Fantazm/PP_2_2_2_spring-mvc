package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }


    /*    @GetMapping(value = "/cars")
        public String carsModel(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
            List<Car> cars = carService.listCars(count);
            model.addAttribute("cars", cars);
            return "cars";
        }*/
    @GetMapping(value = "/cars")
    public String carsModel(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla Cybertruck", "Metallic", 2023));
        cars.add(new Car("Nissan", "Red", 2014));
        cars.add(new Car("Porsche", "Blue", 2024));
        cars.add(new Car("Ford", "Yellow", 1999));
        cars.add(new Car("Toyota", "Blue", 2006));

        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", carService.listCars(cars, count));
        }
        return "cars";
    }
}
