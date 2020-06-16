package com.jframe;

import java.net.PortUnreachableException;
import java.util.Random;

public class Snow extends Thread{
    Random random = new Random();
    int x = random.nextInt(600);
    int y = random.nextInt(450);
    SnowCanvas parent;
    public Snow(SnowCanvas parent) {
        this.parent = parent;
    }
    public void run() {
        for (int i = 0; i < 300; i++) {
            int direction = random.nextInt(3)-1;
            x = x + direction;
            y++;
            parent.repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
