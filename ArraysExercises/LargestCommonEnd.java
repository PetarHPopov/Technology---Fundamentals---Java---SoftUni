package ArraysExercise;

import java.util.Scanner;

public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        int countFront = CountEquals(first, second);
        String[] rev1 = revers(first);
        String[] rev2 = revers(second);
        int countEnd = CountEquals(rev1, rev2);
        int maxCount = Math.max(countFront, countEnd);
        System.out.println(maxCount);
    }

    private static int CountEquals(String[] first, String[] second) {
        int length = Math.min(first.length, second.length);
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (first[i].equals(second[i])) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private static String[] revers(String[] reverest) {
        String[] rev = new String[reverest.length];
        for (int i = 0; i < reverest.length; i++) {
            rev[i] = reverest[reverest.length - 1 - i];
        }
        return rev;
    }

}
