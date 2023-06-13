package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        String[] charArray = { string1.substring(0, 2), string2.substring(string2.length() - 2) };

        for (String character : charArray) {
            System.out.print(character);
        }
    }
}
