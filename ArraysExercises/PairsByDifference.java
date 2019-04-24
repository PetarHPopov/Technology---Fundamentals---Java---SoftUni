package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class PairsByDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int diff = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (Math.abs(numbers[i] - numbers[j]) == diff){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
