package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println(printMiddleCharacters(text));
    }

    private static String printMiddleCharacters(String text) {
        String line = "";

        int index = text.length() / 2;
        if (text.length() % 2 == 0) {
            line += text.charAt(index - 1);
            line += text.charAt(index);
        } else {
            line += text.charAt(index);
        }
        return line;
    }
}
