package web.service;

import org.springframework.stereotype.Service;

import web.model.Car;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList = List.of(
            new Car(1, "BMW", "Black"),
            new Car(2, "Audi", "White"),
            new Car(3, "Mercedes", "Red"),
            new Car(4, "Lada", "Blue"),
            new Car(5, "Volvo", "Green")
    );

    public List<Car> getCars(int count) {

            return count < 5 && count > 0 ? carList.subList(0, count) : carList;
    }
}
