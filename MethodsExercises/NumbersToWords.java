package MethodsExercises;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());

        String outputMessage = "";

        for (int i = 0; i < inputNumber; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber > 0 && currentNumber < 100) {
                continue;
            } else if (currentNumber > 999) {
                System.out.println("too large ");
                continue;
            } else if (currentNumber < -999) {
                System.out.println("too small");
                continue;
            }

            String message = currentNumber < 0 ? "minus " : "";

            outputMessage = letterIze(Math.abs(currentNumber));
            System.out.println(message + outputMessage);

        }


    }

    static String letterIze(int number) {
        String[] toTens = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        String[] teens = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        String outputMessage = toTens[number / 100] + "-hundred";
        if (number % 100 == 0) {
            return outputMessage;

        }else if (number % 100 <= 10){
            outputMessage = outputMessage + " and " + toTens[number % 100];

        }else if (number % 100 > 10 && number % 100 <= 19){
            outputMessage = outputMessage + " and " + teens[number % 10];

        }else if (number % 10 == 0){
            outputMessage = outputMessage + " and " + tens[number % 100 / 10];

        }else outputMessage = outputMessage + " and " + tens[number % 100 / 10] + " " + toTens[number % 10];


        return outputMessage;
    }

}
