package MethodsLAB;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("int")) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());

            System.out.println(getMaxInt(firstNum, secondNum));

        }else if (input.equals("char")){
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);

            System.out.println(getMaxChar(first, second));

        }else if (input.equals("string")){
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();

            System.out.println(getMaxString(firstString, secondString));
        }
    }

    private static int getMaxInt(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    private static char getMaxChar(char first, char second) {

        if (first > second) {
            return first;
        }
        return second;
    }

    private static String getMaxString(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }
}
