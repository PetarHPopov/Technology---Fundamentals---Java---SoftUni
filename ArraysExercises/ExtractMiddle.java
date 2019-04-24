package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = numbers.length;

        if (length % 2 == 0) {
            System.out.println(String.format("{ %d, %d }",numbers[length/2 - 1],numbers[length/2]));
        }else if (length == 1){
            System.out.println(String.format("{ %d }",numbers[0]));
        }else {
            System.out.println(String.format("{ %d, %d , %d }",numbers[length/2 - 1],numbers[length/2],numbers[length/2 + 1]));
        }
    }
}
