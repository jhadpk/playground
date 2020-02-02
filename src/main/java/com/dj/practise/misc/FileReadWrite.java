package com.dj.practise.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author deepakjha on 1/7/20
 * @project playground
 */
public class FileReadWrite {

    public static void main(String[] args) {
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new FileReader("/Users/deepakjha/read.txt"));
            Scanner sc = new Scanner(br);
            fw = new FileWriter("/Users/deepakjha/write.txt");
            while (sc.hasNext()) {
                fw.write(sc.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
