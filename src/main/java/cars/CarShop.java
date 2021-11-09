package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String carShopName;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String carShopName, int maxPrice) {
        this.carShopName = carShopName;
        this.maxPrice = maxPrice;
    }

    public String getCarShopName() {
        return carShopName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sumPrice = 0;
        for (Car car : carsForSell) {
            sumPrice += car.getPrice();
        }
        return sumPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int count = 0;
        for (int i = 0; i < carsForSell.size(); i++) {
            if (carsForSell.get(i).getPrice() < price) {
                count++;
            }
        }
        return count;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsByBrand = new ArrayList<>();
        for (Car car : carsForSell) {
            if (car.getBrand().equals(brand)) {
                carsByBrand.add(car);
            }
        }
        return carsByBrand;
    }
}
