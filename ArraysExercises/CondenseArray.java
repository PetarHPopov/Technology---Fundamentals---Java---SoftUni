package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (first.length > 1){

            int[] second = new int[first.length-1];

            for (int j =0; j < second.length ; j++) {
                second[j] = first[j] + first[j+1];
            }
            first = second;
        }

        System.out.println(first[0]);
    }
}
