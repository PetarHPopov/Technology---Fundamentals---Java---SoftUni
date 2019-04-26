package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printTopNumbers(number);

    }

    private static void printTopNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;
            int digit = 0;
            boolean isValid = false;
            while (num > 0) {
                digit = num % 10;
                sum += digit;
                if (digit %2 != 0){
                    isValid = true;
                }
                num /= 10;
            }

            if (sum % 8 == 0 && isValid) {
                System.out.println(i);
            }
        }

    }
}
