package com.tom;



import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        final double PI = 3;
        //如何避免執行過程中出錯  3/17
        System.out.println("Please enter your age:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        try {
            int age = Integer.parseInt(s);  //字串轉換成數字
            System.out.println( Math.sqrt(age)*10);
        } catch (NumberFormatException e) {
            System.out.println("Hello!?");
            //e.printStackTrace();
        }

    }
}
