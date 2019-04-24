package ArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class Training {

    static String repeatedString(char toRepeat, int times) {
        String repeatedString = "";
        for (int i = 0; i < times; i++) {
            repeatedString += toRepeat;
        }
        return repeatedString;
    }

    static String repeatToNowLine(String toRepeat, int times) {
        String repeatedString = "";
        for (int i = 0; i < times; i++) {
            repeatedString += toRepeat + System.lineSeparator();
        }
        return repeatedString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String stars = repeatedString('*', n);
        System.out.println(stars);
        System.out.print(repeatToNowLine("*" + repeatedString(' ', n - 2) + "*", n - 2));
        System.out.println(stars);
    }
}




