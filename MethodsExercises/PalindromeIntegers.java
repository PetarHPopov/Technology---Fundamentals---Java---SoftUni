package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputNumber = scan.nextLine();



        while (!"END".equals(inputNumber)) {

            palindromeIntegers(inputNumber);

            inputNumber = scan.nextLine();
        }

    }

    private static void palindromeIntegers(String inputNumber) {
        int num = Integer.parseInt(inputNumber);

        int number = num;
        int dig = 0;
        int rev = 0;

        while (num > 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        if (number == rev){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
