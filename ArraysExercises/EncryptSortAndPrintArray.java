package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < line.length(); j++) {
                char symbol = line.charAt(j);
                if (isVowel(symbol)) {
                    sum += symbol * line.length();
                } else  {
                    sum += symbol / line.length();
                }
            }
            num[i] = sum;
        }
        Arrays.sort(num);
        for (int i : num) {
            System.out.println(i);
        }
    }

    private static boolean isVowel(char c) {
        String vowel = "aeiouAEIOU";
        return vowel.contains(c + "");
    }
}
