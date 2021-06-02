package Lesson2.Package3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String next = "";
        Scanner in = new Scanner(System.in);
        while (true){
            next = in.next();
            if(next.equals("end")){
                break;
            }else {
                list.add(next);
            }
        }

        for (String word : list) {
            System.out.println(word);
        }
    }
}
