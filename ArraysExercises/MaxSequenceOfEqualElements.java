package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int count = 1;
        int maxLigth = 1;
        int index = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i].equals(numbers[i + 1])) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxLigth) {
                maxLigth = count;
                index = i + 1;
            }
        }

        int begin = (index - maxLigth) + 1;
        for (int i = begin; i < begin + maxLigth; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
