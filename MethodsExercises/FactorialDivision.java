package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        double factorialNumOne = factorial(numberOne);
        double factorialNumTwo = factorial(numberTwo);
        double result = factorialNumOne  / factorialNumTwo;
        System.out.println(String.format("%.2f",result));
    }

    private static double factorial(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
