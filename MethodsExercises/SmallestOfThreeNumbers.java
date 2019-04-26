package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firsNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        System.out.println(minNumber(firsNumber, secondNumber, thirdNumber));
    }

    public static Integer minNumber(int f, int s, int t) {
        int minNumber = Math.min(Math.min(f, s), t);
        return minNumber;
    }

}
