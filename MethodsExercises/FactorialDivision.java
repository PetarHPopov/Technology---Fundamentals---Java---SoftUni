package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());

        double divisionResult = fact(first) / fact(second);

        System.out.println(String.format("%.2f", divisionResult));

    }

//    private static double fact(double num) {
//
//        double factorial = 1;  //факториел от 1 е 1 и затова го задаваме а за другите
//                               // правим форцикъл
//        for (int i = 2; i <= num; i++) {
//            factorial *=i;
//
//        }
//        return factorial;
//    }

    private static double fact(double num) {   // с рекурсия от по голямото число към по малкото

        if (num < 1) {
            return 1;
        }
        return num * fact(num -1);
    }
}
