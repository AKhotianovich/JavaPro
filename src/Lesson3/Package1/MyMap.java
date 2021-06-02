package Lesson3.Package1;

import java.util.HashMap;
import java.util.Scanner;

public class MyMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String FirstName = "";
        String City = "";

        while (true){
            City = in.next();
            if (City.equals("end")) break;
            FirstName = in.next();

            map.put(City, FirstName);
        }

        System.out.println();
        System.out.println();
        System.out.print("Введите город ");
        City = in.next();
        System.out.println(map.get(City));
    }


}
