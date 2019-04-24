package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean isValid = false;
        for (int currIndex = 0; currIndex < numbers.length; currIndex++) {
            for (int nextIndex = currIndex + 1; nextIndex < numbers.length; nextIndex++) {

                sum = numbers[currIndex] + numbers[nextIndex];

                for (int i = 0; i < numbers.length; i++) {
                    if (sum == numbers[i]) {
                        System.out.println(String.format("%d + %d == %d", numbers[currIndex], numbers[nextIndex], sum));
                        isValid = true;
                        break;
                    }
                }
            }
        }

        if (!isValid) {
            System.out.println("no");
        }
    }
}

