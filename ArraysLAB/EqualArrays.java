package ArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrOne = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrTwo = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        int maxLength = Math.max(arrOne.length, arrTwo.length);
        boolean isValid = true;

        for (int i = 0; i < maxLength; i++) {
            sum += arrOne[i];
            if (arrOne[i] != arrTwo[i]) {
                isValid = false;
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                break;
            }
        }
        if (isValid){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
