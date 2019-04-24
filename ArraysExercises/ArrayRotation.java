package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        rotation = rotation % input.length;

        for (int i = 0; i < rotation ; i++) {

            String element = input[0];

            for (int j = 0; j < input.length-1 ; j++) {
                input[j] = input[j + 1];
            }
            input[input.length-1] = element;
        }
        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
