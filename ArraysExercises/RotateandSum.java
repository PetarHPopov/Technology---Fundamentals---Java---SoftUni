package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class RotateandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int n = Integer.parseInt(scanner.nextLine());

        int[] sum = new int[arr.length];

        for (int i = 0; i < n; i++) {

            arr = RotateArray(arr);

            for (int j = 0; j < arr.length; j++) {
                sum[j] += arr[j];
            }
        }
        for (int i : sum) {
            System.out.print( i + " ");
        }

    }

    private static int[] RotateArray(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            res[i+1] = arr[i];
        }
        return res;

    }
}
