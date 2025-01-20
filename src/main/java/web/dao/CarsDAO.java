package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMV", 2020, Color.RED));
        cars.add(new Car("Nissan", 2021, Color.BLUE));
        cars.add(new Car("Toyota", 2022, Color.GREEN));
        cars.add(new Car("GM", 2023, Color.black));
        cars.add(new Car("Honda", 2024, Color.yellow));
    }

    public List<Car> getAllCars() {
        return cars;
    }

   public List<Car> getCars(int count) {
        return  cars.subList(0, Math.min(count, cars.size()));
   }
}
