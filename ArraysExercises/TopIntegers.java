package ArraysExercise;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrStr = input.split(" ");
        int[] numbers = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            numbers[i] = Integer.parseInt(arrStr[i]);
        }


        for (int i = 0; i < numbers.length; i++) {
            boolean isValid = true;
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] <= numbers[j]) {
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
