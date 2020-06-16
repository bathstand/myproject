package com.jframe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowCanvas extends Canvas {
    List<Snow> snows = new ArrayList<Snow>();

    public SnowCanvas() {
        for (int i = 0; i < 50; i++) {
            Snow snow = new Snow(this);
            snow.start();
            snows.add(snow);
        }
        setBackground(Color.BLACK);
    }


    public void paint(Graphics g) {
        for (Snow snow : snows) {
            g.setColor(Color.white);
            g.drawString("雪", snow.x, snow.y);

        }

    }
}
