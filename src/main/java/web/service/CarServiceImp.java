package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Volvo", 2010, "Blue"));
        cars.add(new Car("BMW", 2015, "Black"));
        cars.add(new Car("Mers", 2017, "White"));
        cars.add(new Car("Opel", 2003, "Green"));
        cars.add(new Car("Tesla", 2024, "Yellow"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int countOfCars) {
        if (countOfCars <= cars.size()) {
            return cars.subList(0, countOfCars);
        } else {
            return cars;
        }
    }
}