package ArraysLAB;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputArr = input.split(" ");
        int lengthArr = inputArr.length;

        int[] number = new int[lengthArr];

        for (int i = 0; i < lengthArr; i++) {
            String num = inputArr[i];
            number[i] = Integer.parseInt(num);
        }

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                sum += number[i];
            }

        }
        System.out.println(sum);

    }

}
