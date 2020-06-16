package com.tom;

import java.io.*;
import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        int total = 0;

        try {
            FileReader fr = new FileReader("Pig.txt");
            BufferedReader br = new BufferedReader(fr);

            try {
                total = Integer.parseInt(br.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                total = 0;
            }
            System.out.println("There are " + total + " dollar in Pig!");
            System.out.println("請投入1 5 10元");

            while (money != -1) {
                money = scanner.nextInt();
                switch (money) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + money;
                        FileWriter fw = new FileWriter("Pig.txt", false);
                        fw.write(String.valueOf(total));
                        fw.flush();
                        fw.close();
                        break;
                    default:
                }

                System.out.println("Now,there are " + total + " dollar in the Pig.");
            }
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}