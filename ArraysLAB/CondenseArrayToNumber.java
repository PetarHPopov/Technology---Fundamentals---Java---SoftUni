package ArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = new int[firstArray.length - 1];

        if (firstArray.length == 1) {
            System.out.println(firstArray[0]);
            return;
        }
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length - i; j++) {

                secondArray[j] = firstArray[j] + firstArray[j + 1];

            }
            firstArray = secondArray;
        }
        System.out.println(secondArray[0]);
    }

}
