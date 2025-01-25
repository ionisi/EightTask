package web.service;

import web.models.Car;

import java.util.List;

public interface UserService {
    List<Car> getAllCars();
    List<Car> getCars(int count);
}
