package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int counter = 0;
        int bestCounter = 0;
        String value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }
            if (counter > bestCounter) {
                bestCounter = counter;
                value = arr[i];
            }
           counter = 0;
        }
        System.out.println(value);
    }
}
