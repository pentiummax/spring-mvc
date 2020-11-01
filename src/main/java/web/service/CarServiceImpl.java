package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = Arrays.asList(new Car("bmw", 100, 200),
            new Car("audi", 200, 300), new Car("volkswagen", 230, 400),
            new Car("bmw", 200, 300), new Car("audi", 100, 600));

    @Override
    public List<Car> getNCars(Integer n) {
        if (Objects.isNull(n)) {
            n = 5;
        } else if (n >= 5) {
            n = 5;
        }
        return carList.stream().limit(n).collect(Collectors.toList());
    }

}
