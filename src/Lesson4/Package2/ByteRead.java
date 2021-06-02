package Lesson4.Package2;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class ByteRead {
    public static void main(String[] args) {
        Random random = new Random(10);
        int[] rand = new int[10];
        for (int i = 0; i < 10; i++) {
            rand[i] = random.nextInt();
        }

        try {
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test1.txt"), "Cp866"));
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test1.txt"), "Cp866"));
            int c = 0;
            for (int tmp: rand) {
                wr.write(tmp + "");
            }
            wr.flush();
            int i = 0;
            ArrayList list = new ArrayList();
            while ((c = br.read()) != -1) {
                if (c == 32) {
                    i++;
                    continue;
                }else {
                    list.add(c);
                }
            }

            for (int i1 = 0; i1 < list.size(); i1++) {
                System.out.println(list.get(i1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
