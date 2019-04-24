package ArraysLAB;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputArr = input.split(" ");
        int length = inputArr.length;

        int[] number = new int[length];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < length; i++) {
            String inputStr = inputArr[i];
            number[i] = Integer.parseInt(inputStr);

            if (number[i] % 2 == 0) {
                evenSum += number[i];
            }else {
                oddSum+=number[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }

}
