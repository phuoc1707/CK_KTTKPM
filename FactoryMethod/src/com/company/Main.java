package com.company;

import com.company.CarFactory.CarFactory;
import com.company.entity.Car;

public class Main {

    public static void main(String[] args) {
        Car car= CarFactory.getCar("honda","ABC","BAC","ÁDFA","ÁAAAAAAAAA");
        System.out.println("honda"+car);

        Car car1= CarFactory.getCar("toyota","ABC","BAC","ÁDFA","ÁAAAAAAAAA");
        System.out.println("toyota"+car1);

        Car car2= CarFactory.getCar("nexus","ABC","BAC","ÁDFA","ÁAAAAAAAAA");
        System.out.println("nexus"+car2);
    }
}
