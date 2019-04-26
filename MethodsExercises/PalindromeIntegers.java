package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!"END".equals(line)){

            polindromeOrNot(line);

            line = scanner.nextLine();
        }
    }

    private static boolean polindromeOrNot(String line) {
        String rev = "";
        for (int i = line.length()-1; i >=0 ; i--) {
            rev += line.charAt(i);
        }
        if (line.equals(rev)){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
