package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        topNumber(number);

    }

    private static void topNumber(int number) {

        for (int i = 1; i <= number; i++) {
            int digitsOne = i % 10;
            int digitsTho = i / 10;

            int sum = digitsOne + digitsTho;

            if (sum % 8 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
