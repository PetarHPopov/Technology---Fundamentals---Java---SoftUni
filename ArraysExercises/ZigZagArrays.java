package ArraysExercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lineCount = Integer.parseInt(scan.nextLine());

        int[] first = new int[lineCount];           // може и да са стрингове защото ние с тези числа не правим сметки ние ги записваме и отпечатваме само
        int[] second = new int[lineCount];

        for (int i = 0; i < lineCount; i++) {
            String[] numbers = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                first[i] =Integer.parseInt(numbers[0]);
                second[i] = Integer.parseInt(numbers[1]);
            }else {
                first[i] =Integer.parseInt(numbers[1]);
                second[i] = Integer.parseInt(numbers[0]);
            }

        }
        for (int numbers : first) {
            System.out.print(numbers + " ");
        }
        System.out.println();
        for (int numbers : second) {
            System.out.print(numbers + " ");
        }

    }

}
