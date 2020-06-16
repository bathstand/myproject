package com.fju;

import java.io.*;

public class PiggyBank {
    int total;
    File dataFile = new File("Pig2.txt");
    int ones ;
    int fives ;
    int tens ;

    public PiggyBank() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(dataFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            total = Integer.parseInt(s);
            ones = Integer.parseInt(bufferedReader.readLine());
            fives = Integer.parseInt(bufferedReader.readLine());
            tens = Integer.parseInt(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void saveTotal(int total) {
        this.total = total;

        try {
            FileWriter fw = new FileWriter(dataFile);
            fw.write(String.valueOf(this.total) + "\n");
            fw.write(ones + "\n");
            fw.write(fives + "\n");
            fw.write(String.valueOf(tens));
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }



    public void add(int money) {
        switch (money) {
            case 1:
                ones = ones + 1;
                saveTotal(total + money);
                break;
            case 5:
                fives += 1;
                saveTotal(total + money);
                break;
            case 10:
                tens += 1;
                saveTotal(total + money);
                break;
            default:
        }




    }

    public void showCoins(){

        System.out.println("ones: " + ones + " fives: " + fives + " tens: " + tens);
    }
}
