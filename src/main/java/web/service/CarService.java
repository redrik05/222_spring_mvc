package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("LADA", "Ivan"));
        cars.add(new Car("LADA", "Anton"));
        cars.add(new Car("LADA", "Ian"));
        cars.add(new Car("LADA", "Ivar"));
        cars.add(new Car("LADA", "Anna"));
    }

    public List<Car> getCarsToDisplay(Integer count) {
        if (count > 5|| count <= 0) {
            return getCars().stream().limit(5).toList();
        } else {
            return getCars().stream().limit(count).toList();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
