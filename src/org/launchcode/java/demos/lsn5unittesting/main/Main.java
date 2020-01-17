package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());

//        car.drive(700);
        car.addGas(5);
        System.out.println("Tank size " + car.getGasTankSize());
        System.out.println("Gas amount " + car.getGasTankLevel());
    }
}
