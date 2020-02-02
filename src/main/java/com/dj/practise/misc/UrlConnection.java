package com.dj.practise.misc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class UrlConnection {
    class Result {
        Parse parse;
    }

    class Parse {
        String title;
        int pageId;
        Text text;
    }

    class Text {
        @SerializedName("*")
        String star;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        String title = "hello";
        try {
            URL url = new URL(
                    "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=" + title);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            Gson gson = new Gson();
            Result result = gson.fromJson(sb.toString(), Result.class);
            String text = result.parse.text.star.toLowerCase();

            int count = 0;

            while (text != null) {
                if (text.contains(title)) {
                    count++;
                    text = text.substring(text.indexOf(title) + 1);
                } else {
                    break;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
