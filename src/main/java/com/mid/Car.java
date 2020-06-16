package com.mid;

import java.util.Scanner;

public class Car {
    String id;
    long entering;
    long leaving;
    public Car(String id) {
       this.id = id;
       entering = System.currentTimeMillis();


    }

}
