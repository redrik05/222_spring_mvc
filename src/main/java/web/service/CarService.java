package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();
    public List<Car> getCars() {
        Car car1 = new Car("LADA", "Ivan");
        Car car2 = new Car("LADA", "Anton");
        Car car3 = new Car("LADA", "Ian");
        Car car4 = new Car("LADA", "Ivar");
        Car car5 = new Car("LADA", "Anna");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
