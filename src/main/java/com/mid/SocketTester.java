package com.mid;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketTester {
    public static void main(String[] args) {
        //像是電話插座，透過插座和其他電話通訊，不用管電話是怎麼連接上的
        /*
        try {
            Socket socket = new Socket("ptt.cc", 23);
            InputStream is = socket.getInputStream();
            int n = is.read();
            System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
        try {
            Socket socket = new Socket("ptt.cc", 23);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
