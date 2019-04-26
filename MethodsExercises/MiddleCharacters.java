package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String result = getMidleChars(str);

        System.out.println(result);

    }

    public static String getMidleChars(String str) {

        String result = "";

        int middleIndex = str.length() / 2; // така взимаме този коийто е в средата

        if (str.length() % 2 == 0) {
            result += str.charAt(middleIndex - 1);   // така когато е 3245  и 4 / 2 трябва да вземем 2 средни на индекс 2 е 4 и така 2-1 = индекс 1 и така взимаме и 2-двойката
            result += str.charAt(middleIndex);
        } else {
            result += str.charAt(middleIndex);
        }
        return result;
    }

}
