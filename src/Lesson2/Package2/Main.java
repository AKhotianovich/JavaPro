package Lesson2.Package2;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = in.nextInt();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(1000));
            System.out.print(list.get(i) + " ");
        }

        System.out.println("Min: " + getMinimum(list) );


    }

    public static int getMinimum(LinkedList<Integer> list){
        int min = list.get(0);
        for (int num: list) {
            if (min > num){
                min = num;
            }
        }
        return min;
    }
}
