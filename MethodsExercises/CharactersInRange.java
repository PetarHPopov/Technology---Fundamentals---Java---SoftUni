package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char begin = scan.nextLine().charAt(0);     // четем ги в обратен ред последния тест  когато begin > end
        char end = scan.nextLine().charAt(0);

        if (begin > end) {

            char temp = begin;
            begin = end;
            end = temp;
        }

        printAsciiInRange(begin, end);

    }

    static void printAsciiInRange(char begin, char end) {

        begin++; // за да избегнем кастването затова просто увеличаваме началото с едно

        for (char symbol = begin; symbol < end; symbol++) {
            System.out.print(symbol + " ");
        }
    }

}
