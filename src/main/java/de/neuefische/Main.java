package de.neuefische;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("1", "VW", "Schwarz");
        Car carWithNewId = car.withId("2");
        Car carCopy = new Car(car.id(), car.brand(), "Rot");
        System.out.println(car);
        System.out.println(carCopy);
        System.out.println(carWithNewId);
        Set<Car> carSet = new HashSet<>();
        carSet.add(car);
    }
}