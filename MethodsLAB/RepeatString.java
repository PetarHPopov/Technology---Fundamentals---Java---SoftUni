package MethodsLAB;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, count));
    }

    private static String repeatString(String text, int count) {
        String line = "";
        for (int i = 0; i < count; i++) {
            line += text;
        }
        return line;
    }
}
