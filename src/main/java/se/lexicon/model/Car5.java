package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class Car5 {
    private int carId;
    private String regNumber;
    private String brand;
    private String model;

    public Car5() {
    }

    public Car5(int carId, String regNumber, String brand, String model) {
        this.carId = carId;
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car5 car5 = (Car5) o;
        return carId == car5.carId && Objects.equals(regNumber, car5.regNumber) && Objects.equals(brand, car5.brand) && Objects.equals(model, car5.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, regNumber, brand, model);
    }

    @Override
    public String toString() {
        return "Car5{" +
                "carId=" + carId +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
