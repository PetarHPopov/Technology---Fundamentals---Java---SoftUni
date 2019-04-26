package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        System.out.println(sumFirstSecond(first, second, third));

    }

    static Integer sumFirstSecond(int f, int s, int t) {
        return f + s - t;
    }
}
