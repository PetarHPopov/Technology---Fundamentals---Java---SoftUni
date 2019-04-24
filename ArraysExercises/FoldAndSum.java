package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] reversed = new int[arr.length / 2];
        int index = 0;

        for (int i = arr.length / 4 - 1; i >= 0; i--) {
            reversed[index] = arr[i];
            index++;
        }
        for (int i = arr.length - 1; i >= arr.length * 3 / 4; i--) {
            reversed[index] = arr[i];
            index++;
        }
        int[] remaining = new int[arr.length / 2];

        index = 0;

        for (int i = arr.length / 4; i < arr.length * 3 / 4; i++) {
            remaining[index] = arr[i];
            index++;
        }

        int[] result = new int[arr.length / 2];

        for (int i = 0; i < reversed.length; i++) {
            result[i] = reversed[i] + remaining[i];
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

