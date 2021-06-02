package Lesson4.Package3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/alexander/Рабочий стол/trash/Kurses at ITVDN/Java Pro/src/Lesson4.Lesson5.Package3/test2.txt"), "Cp866"));
            int c;
            while ((c = br.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
