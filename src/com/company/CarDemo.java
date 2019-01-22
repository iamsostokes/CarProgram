package com.company;

public class CarDemo {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();

        car.setMake("Cadillac");
        car.setModel("DTS");
        car.setYear(2007);

        System.out.println("The make of my car is "+ car.getMake());
        System.out.println("The model of my car is "+ car.getModel());
        System.out.println("The Year of my car is "+ car.getYear());
    }
}
