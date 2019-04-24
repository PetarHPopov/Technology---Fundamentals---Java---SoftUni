package ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char[] letter = word.toCharArray();

        for (int i = 0; i <letter.length ; i++) {
            System.out.println(letter[i] +" -> " +((int)letter[i] - 97 ));
        }
    }
}
