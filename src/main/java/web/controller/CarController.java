package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {
    CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer countOfCars, ModelMap model) {
        if (countOfCars == null) {
            model.addAttribute("cars", carService.getAllCars());
        } else {
            model.addAttribute("cars", carService.getCars(countOfCars));
        }
        return "cars";
    }
}
