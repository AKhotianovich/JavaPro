package Lesson1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Integer tmp = (Integer) iterator.next();
            System.out.println(tmp);

        }

    }
}
