package com.mid;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Reader {
    public static void main(String[] args) {

        try {
           URL url = new URL("http://www.google.com.tw/");
            InputStream  is = url.openStream();
            int n = is.read();
            while (n != -1) {
                System.out.print((char)n);
                n = is.read();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    }

    }
}
