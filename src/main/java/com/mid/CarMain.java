package com.mid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int MAX_SPORT = 20;
        final int CAR_ENTERING = 1;
        final int CAR_LEAVING = 2;
        final int STATUS = 3;
        final int LEAVING = 4;
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int func = 0;
        while (func != 4){
            System.out.println("1) car entering");
            System.out.println("2) car leaving");
            System.out.println("3) status");
            System.out.println("4) leaving");

            String s = scanner.nextLine();
            func = Integer.parseInt(s);

            switch (func) {
                case CAR_ENTERING:
                    System.out.println("Add the ID: ");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added!");
                    break;
                case STATUS:
                    for (Car car : cars) {
                        System.out.println(car.id+"/"+car.entering+"/"+car.leaving);
                    }
                    break;
            }
        }




    }
}
