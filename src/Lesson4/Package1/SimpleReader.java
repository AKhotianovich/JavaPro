package Lesson4.Package1;

import java.io.*;
import java.util.Scanner;

public class SimpleReader {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        out.writeUTF(line);
        out.flush();

        System.out.println(in.readUTF());

    }
}
