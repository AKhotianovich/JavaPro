package Lesson5.Package1;

public class SimpleString {
    public static String str1 = "Привет строка я буду тебя менять";

    public static void main(String[] args) {
        int word1 = str1.indexOf(" ");
        StringBuilder revers = new StringBuilder(str1);
        revers.reverse();
        int word2 = revers.indexOf(" ");
        String firstWord = "";
        String lastWord = "";
        for (int i = 0; i < word1; i++) {
            firstWord += str1.charAt(i);

        }
        for (int i = str1.length() - word2; i < str1.length(); i++) {
            lastWord += str1.charAt(i);
        }
        StringBuilder newStr = new StringBuilder(str1);
        newStr.delete(0, word1);
        newStr.delete(newStr.length() - word2, newStr.length());

        String finalStr = lastWord + newStr + firstWord;
        finalStr.trim();
        System.out.println(finalStr);
        System.out.println(str1.length());
        System.out.println(finalStr.length());
    }

}
