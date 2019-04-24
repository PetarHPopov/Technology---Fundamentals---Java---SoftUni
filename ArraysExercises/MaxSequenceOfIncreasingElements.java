package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        int bestCount = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
            if (arr[i] >= arr[i + 1] || (arr[i] < arr[i + 1]) && (i == arr.length - 2)) {
                if (count > bestCount) {
                    bestCount = count;
                    bestStartIndex = startIndex;
                }
                count = 0;
                startIndex = i + 1;
            }
        }

            for (int i = 0; i <= bestCount; i++) {
                System.out.print(arr[bestStartIndex] + " ");
                bestStartIndex ++;
            }


    }
}
