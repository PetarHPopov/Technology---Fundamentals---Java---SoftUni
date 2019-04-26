package MethodsLAB;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(getEvenAndOddSum(num));
    }

    static int getEvenAndOddSum(int n) {
        n = Math.abs(n);
        int evenSum = 0;
        int oddSum = 0;
        int number = n;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        return evenSum * oddSum;
    }
}
