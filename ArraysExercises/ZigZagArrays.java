package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] furst = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                furst[i] = tokens[0];
                second[i] = tokens[1];
            } else {
                furst[i] = tokens[1];
                second[i] = tokens[0];
            }
        }
        System.out.println(String.join(" ", furst));
        System.out.println(String.join(" ", second));
    }
}
