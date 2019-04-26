package MethodsLAB;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        PrintOfInt(n);
    }
    public static void PrintOfInt(int n){
        if (n > 0){
            System.out.println(String.format("The number %d is positive.",n));
        }else if (n < 0){
            System.out.println(String.format("The number %d is negative.",n));
        }else {
            System.out.printf("The number %d is zero.",n);
        }
    }
}
