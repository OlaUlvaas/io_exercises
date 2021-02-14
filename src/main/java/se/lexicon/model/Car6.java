package se.lexicon.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Car6 implements Serializable {

    private UUID carId;
    private String regNumber;
    private String brand;
    private String model;
    private String regDate;
    private Owner owner;

    public Car6() {
        this.carId = UUID.randomUUID();
    }

    public Car6(String regNumber, String brand, String model, String regDate, Owner owner) {
        this.carId = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }

    public UUID getCarId() {
        return carId;
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

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car6 car = (Car6) o;
        return carId == car.carId && Objects.equals(regNumber, car.regNumber) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, regNumber, brand, model);
    }

    @Override
    public String toString() {
        return "Car6{" +
                "carId=" + carId +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate='" + regDate + '\'' +
                ", owner=" + owner +
                '}';
    }
}
