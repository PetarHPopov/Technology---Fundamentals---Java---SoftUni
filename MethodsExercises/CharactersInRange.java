package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char begin = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        characterInRange(begin, end);
    }

    static void characterInRange(char begin, char end) {
        String text = "";
        if (begin > end) {
            char temp = begin;
            begin = end;
            end = temp;

        }
        for (int i = begin + 1; i < end; i++) {
            text += (char) i + " ";
        }

        System.out.println(text);
    }
}
