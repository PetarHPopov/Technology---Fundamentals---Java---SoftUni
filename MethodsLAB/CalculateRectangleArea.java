package MethodsLAB;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(returnArea(a, b));
    }

    private static int returnArea(int a, int b) {
        return a * b;
    }
}
