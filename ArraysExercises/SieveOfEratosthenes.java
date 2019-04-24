package ArraysExercise;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
                for (int j = i; j < arr.length; j += i) //try j*j
                {
                    arr[j] = false;
                }
            }
        }
    }
}

