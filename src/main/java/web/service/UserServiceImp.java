package web.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.dao.CarsDAOImp;
import web.models.Car;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final CarsDAO carsDAO;

    @Autowired
    public UserServiceImp(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Transactional
    @Override
    public List<Car> getAllCars() {
        return carsDAO.getAllCars();
    }

    @Transactional
    @Override
    public List<Car> getCars(int count) {
        return carsDAO.getCars(count);
    }
}
