package com.knoldus;
import factory.CarFactory;
import repo.Car;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
     CarFactory carFactory = new CarFactory();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a car");
        String str= sc.nextLine();
        Car car = carFactory.getCar(str);
        car.setColor();
        car.getColor();
    }
}