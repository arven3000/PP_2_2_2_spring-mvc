package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Lamborghini", "Diablo GTR", 590));
        cars.add(new Car("Ferrari", "F8 Tributo", 720));
        cars.add(new Car("Bugatti", "Veyron", 1001));
        cars.add(new Car("Aston Martin", "Vulcan", 800));
        cars.add(new Car("Maserati ", "MC20", 621));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count)
                    .collect(Collectors.toList());
        }
    }
}
