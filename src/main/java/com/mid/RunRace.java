package com.mid;

public class RunRace {
    public static void main(String[] args) {
        Horse h2 = new Horse();
        h2.start();
        Horse h3 = new Horse();
        h3.start();
        for (int i = 0; i<100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(50);    //睡一下讓別人跑
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
