package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();
    public List<Car> getCars(Integer count) {
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
        if (count > 5|| count <= 0) {
            return cars.stream().limit(5).toList();
        } else {
            return cars.stream().limit(count).toList();
        }
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
