package ArraysExercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rigthSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rigthSum += numbers[j];
            }

            if (leftSum == rigthSum) {
                System.out.println(i);
               return;
            }
        }
        System.out.println("no");
    }
}

