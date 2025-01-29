package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDAO {
    List<Car> getCarsById(int count);
}
