package ArraysExercise;

import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (s1.compareTo(s2) <= 0) {
            System.out.println(String.join("", s1.split(" ")));
            System.out.println(String.join("", s2.split(" ")));
        } else {
            System.out.println(String.join("", s2.split(" ")));
            System.out.println(String.join("", s1.split(" ")));
        }
    }
}
