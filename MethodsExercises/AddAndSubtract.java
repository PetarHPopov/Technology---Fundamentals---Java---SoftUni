package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        int sum = sumIntegers(numOne, numTwo);
        System.out.println(subtract(sum, numThree));
    }

    private static int sumIntegers(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    private static int subtract(int sum, int numThree) {
        return sum - numThree;
    }
}
