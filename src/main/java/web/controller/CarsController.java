package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsModel(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCars();

        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", carService.listCars(cars, count));
        }

        return "cars";
    }
}
