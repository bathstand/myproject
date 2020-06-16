package com.tom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTester {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr); //裡面只能放FileReader
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

           /* int data = fr.read();
            while (data != -1){
                System.out.println((char)data);
                data = fr.read();
            }
           */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
