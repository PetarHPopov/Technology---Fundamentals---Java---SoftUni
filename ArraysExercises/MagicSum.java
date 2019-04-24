package ArraysExercises;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strNumber = scan.nextLine().split(" ");
        int[] numbers = new int[strNumber.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumber[i]);
        }


        int controlNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {  // започваме от i + 1 защото вместо 1 + 7 ще се отпечата и 7 + 1 и така не е уникална двойката
                int sum = numbers[i] + numbers[j];
                if (sum == controlNumber) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }

        }

    }

}
