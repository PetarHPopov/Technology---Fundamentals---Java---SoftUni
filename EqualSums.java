package ArraysExercises;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] number = scan.nextLine().split(" ");

        int[] num = new int[number.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(number[i]);
        }

        boolean isValid = false;

        for (int i = 0; i < num.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += num[j];
            }
            for (int j = i + 1; j < num.length; j++) {
                rightSum += num[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                isValid = true;
                break;
            }
        }
        if (!isValid){
            System.out.println("no");
        }
    }

}
