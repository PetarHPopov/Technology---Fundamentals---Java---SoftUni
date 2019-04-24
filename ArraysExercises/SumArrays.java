package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] second = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = Math.max(first.length, second.length);
        int[] sumArr = new int[length];

        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = first[i % first.length] + second[i % second.length];

        }
        for (int num : sumArr) {
            System.out.print(num + " ");
        }
    }
}
