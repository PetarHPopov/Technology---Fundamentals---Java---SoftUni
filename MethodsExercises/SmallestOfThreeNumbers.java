package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallestNumber(a, b, c));
    }
    static int getSmallestNumber(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}
