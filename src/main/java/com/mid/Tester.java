package com.mid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://quality.data.gov.tw/dq_download_json.php?nid=26652&md5_url=742805bc2a7cac38b073e7a6a2c5ac80");
//            URLConnection connection = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();  //用Http連線
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));  //要背,裡面是InputStream
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder();   //往後面加東西
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
