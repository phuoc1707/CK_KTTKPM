package com.company;

public class CarFactory {
    public  static Car getCar(CarAbstractFactory factory){
        return factory.createCar();
    }
}
