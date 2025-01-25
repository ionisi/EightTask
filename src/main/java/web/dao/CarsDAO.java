package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDAO {
    List<Car> getAllCars();
    List<Car> getCars(int count);
}
