package com.mid;

public class Horse extends Thread{
    public void run() {
        for (int i = 0; i<100; i++) {
            System.out.println(getName()+": "+i);
            try {
                Thread.sleep(50);   //要先睡一下讓別人跑
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}