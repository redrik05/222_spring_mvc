package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCarsToDisplay(Integer count) {
        Car car1 = new Car("LADA", "Ivan");
        Car car2 = new Car("LADA", "Anton");
        Car car3 = new Car("LADA", "Ian");
        Car car4 = new Car("LADA", "Ivar");
        Car car5 = new Car("LADA", "Anna");
        getCars().add(car1);
        getCars().add(car2);
        getCars().add(car3);
        getCars().add(car4);
        getCars().add(car5);
        if (count > 5|| count <= 0) {
            return getCars().stream().limit(5).toList();
        } else {
            return getCars().stream().limit(count).toList();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
