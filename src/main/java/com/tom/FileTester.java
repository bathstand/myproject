package com.tom;

import java.io.*;


public class FileTester {
    public static void main(String[] args) {
       /*
        File file = new File("src");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        */
       // File file = new File("text.txt");


        /*

        try {
            FileOutputStream  fos = new FileOutputStream("test.txt");
            fos.write(66);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */



        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("1");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

       /* try {
            FileWriter writer = new FileWriter("abc.txt");
            writer.write(65);
            writer.write("I have 190");
            writer.flush();   //手動輸入訊息
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}
