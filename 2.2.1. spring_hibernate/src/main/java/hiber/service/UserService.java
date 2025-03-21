package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {

    User findUserByCar(String model, int series);
    void add(User user);
    void addCar(Car car);
    List<User> listUsers();
}
