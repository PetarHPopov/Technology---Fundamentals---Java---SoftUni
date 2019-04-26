package MethodsExercises;

import java.util.Scanner;

public class FindNthDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int index = Integer.parseInt(scan.nextLine());

        System.out.println(findNthDigit(number, index));

    }

    private static int findNthDigit(int number, int index) {
        int digits = 0;
        for (int i = 0; i < index; i++) {
            digits = number % 10;
            number /= 10;
        }
        return digits;
    }

}
