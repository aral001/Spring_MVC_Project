package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    @Override
    public List<Car> countOfCars(int count) {
        cars = new ArrayList<>();
        cars.add(new Car("bmw","x5","V8"));
        cars.add(new Car("mazda", "6", "V2"));
        cars.add(new Car("mazda", "3", "V4"));
        cars.add(new Car("ford", "mondeo", "V8"));
        cars.add(new Car("kia", "cerato", "V6"));
        return cars.subList(0, count);
    }
}
