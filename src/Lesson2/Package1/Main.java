package Lesson2.Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(in.next());
        }
        System.out.println();


        ArrayList<String> newArray = doubleValues(words);
        for (String a: newArray) {
            System.out.println(a);
        }


    }
    public static ArrayList doubleValues(ArrayList<String> word){
        ArrayList arrayList = new ArrayList();
        for (String words : word) {
            arrayList.add(words);
            arrayList.add(words);
        }
        return arrayList;
    }
}
