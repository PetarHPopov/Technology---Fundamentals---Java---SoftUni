package ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] number = new int[n];

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            number[i] = num;
        }
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.stream(number).sum());
    }
}
