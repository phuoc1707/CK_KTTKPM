package com.company;

public class Test {
    public static void main(String[] args) {
        Car toyota= CarFactory.getCar(new ToyotaFactory("xe lăn tốc độ","123 HZ","sdsad","ádsad"));
        Car nexus= CarFactory.getCar(new NexusFactory("xe lăn tốc độ","123 HZ","sdsad","ádsad"));
        Car honda= CarFactory.getCar(new HondaFactory("xe lăn tốc độ","123 HZ","sdsad","ádsad"));

        System.out.println("toyota:  "+ toyota.toString());
        System.out.println("nexus:  "+ nexus.toString());
        System.out.println("honda:  "+ honda.toString());
    }
}
