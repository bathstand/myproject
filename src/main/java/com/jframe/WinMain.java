package com.jframe;

import javax.swing.*;

public class WinMain extends JFrame {
    public WinMain() {
        setSize(600, 450);  //設定螢幕大小
        setVisible(true); //顯現出來
        SnowCanvas canvas = new SnowCanvas();
/*
        //設定一個面板panel，再把按鈕button放在panel裡,不然button會佔滿整個畫面
        JPanel panel = new JPanel();
        JButton button = new JButton("Hello");
        panel.add(button);
        add(panel);
*/
        add(canvas);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //按叉直接停止,裡面也可以打2


    }


    public static void main(String[] args) {
        new WinMain();
    }
}
