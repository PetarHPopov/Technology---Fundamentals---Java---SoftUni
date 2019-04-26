package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipolationDEMo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrString = scanner.nextLine().split("\\s+");
        int[] numbers = new int[arrString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrString[i]);
        }

        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("exchange")) {
                int index = Integer.parseInt(tokens[1]);
                if (index < 0 || index >= numbers.length) {
                    System.out.println("Invalid index");
                } else {
                    numbers = exchange(numbers, index);
                }
            } else if (comand.equals("max")) {
                String cmd = tokens[1];
                foundMaxEvenOddIndex(numbers, cmd);
            } else if (comand.equals("min")) {
                String cmd = tokens[1];
                foundMinEvenOddIndex(numbers, cmd);
            } else if (comand.equals("first")) {
                int count = Integer.parseInt(tokens[1]);
                String cmd = tokens[2];
                printFirstOddEvenElement(numbers, count, cmd);
            } else if (comand.equals("last")) {
                int count = Integer.parseInt(tokens[1]);
                String cmd = tokens[2];
                lastCountElements(numbers, count, cmd);
            }


            line = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void lastCountElements(int[] numbers, int count, String cmd) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return;
        }

        int num = cmd.equals("even") ? 0 : 1;

        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                result[index++] = numbers[i];
            }
        }

        if (index == 0) {
            System.out.println("[]");
        } else {
            int startIndex = index - count;
            if (startIndex < 0) {
                startIndex = 0;
            }
            String output = "[";
            for (int i = startIndex; i < index; i++) {

                if (i < index - 1) {
                    output += result[i] + ", ";
                } else {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    private static void printFirstOddEvenElement(int[] numbers, int count, String cmd) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return;
        }
        int num = cmd.equals("even") ? 0 : 1;
        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == num) {
                result[index++] = numbers[i];

                if (index == count) {
                    break;
                }
            }
        }

        if (index == 0) {
            System.out.println("[]");

        } else {
            String output = "[";
            for (int i = 0; i < index; i++) {

                if (i < index - 1) {
                    output += result[i] + ", ";
                } else {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }


    private static void foundMinEvenOddIndex(int[] numbers, String cmd) {
        int num = cmd.equals("even") ? 0 : 1;
        int index = -1;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] <= minElement) {
                    minElement = numbers[i];
                    index = i;
                }
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static void foundMaxEvenOddIndex(int[] numbers, String cmd) {
        int num = cmd.equals("even") ? 0 : 1;
        int index = -1;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] >= maxElement) {
                    maxElement = numbers[i];
                    index = i;
                }
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static int[] exchange(int[] numbers, int index) {

        int[] newNumbers = new int[numbers.length];
        int count = 0;  // правимси външен индексатор за пренареждането на новиш масив
        for (int i = index + 1; i < numbers.length; i++) {
            newNumbers[count++] = numbers[i];
        }
        for (int i = 0; i <= index; i++) {
            newNumbers[count++] = numbers[i];
        }
        return newNumbers;
    }
}
