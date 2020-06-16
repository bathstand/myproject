package com.tom;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        //平分錢的除錯 3/17
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total:");
        int total = Integer.parseInt(scanner.nextLine());
        System.out.println("Need to split bill?");
        String yn = scanner.nextLine();
        if (yn.equalsIgnoreCase("y")) {
            System.out.println("How many kids?");
            try {
                int n = Integer.parseInt(scanner.nextLine());
                int eachPaid = total / n;
                System.out.println(eachPaid + " for each.");
            } catch (NumberFormatException e1) {    //不是打數字
                System.out.println("Hello!?");
                //e.printStackTrace();
            } catch (ArithmeticException e2) {     //打0
                System.out.println("Helloooooo!!!! ZERO???");
                //e.printStackTrace();
            }
        }
    }
}
