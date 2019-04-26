package MethodsExercises;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTribonacci(n);
    }

    static int calculateTribRecursia(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        return calculateTribRecursia(n - 1)
                + calculateTribRecursia(n - 2)
                + calculateTribRecursia(n - 3);
    }
    static void printTribonacci(int n ){
        for (int i = 1; i <= n ; i++) {
            System.out.print(calculateTribRecursia( i ) + " ");
        }

    }
}
