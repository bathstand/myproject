package com.fju;

import java.util.Scanner;

public class BeautifulWorld {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank();
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        System.out.println("Total = " + piggy.total);
        piggy.showCoins();
        System.out.println("Put your coin!");
        while(money != -1) {
            money = scanner.nextInt();
            switch (money) {
                case 1:
                case 5:
                case 10:
                    piggy.add(money);
                    break;
                default:
            }
            System.out.println("Total: " + piggy.total);
            piggy.showCoins();

        }
    }
}
