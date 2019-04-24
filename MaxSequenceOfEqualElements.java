package ArraysExercises;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strNumber = scan.nextLine().split(" ");
        int[] number = new int[strNumber.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(strNumber[i]);
        }

        int counter = 1;
        int maxLength = 1;
        int bestIndex = 0;

        for (int i = 0; i < number.length - 1; i++) {  // винаги като сравняваме елемент и следващиш до него
            // цикъла се върти до дължината - 1,защото като стигнем последниш
            //елемент ншма към кого да погледнем
            if (number[i] == number[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxLength) {
                maxLength = counter;
                bestIndex = i + 1;   // защото той е последния в редицата ни
            }
        }
        int beginIndex = (bestIndex - maxLength) + 1;  // добавяме едно защото се брои от 0123456 и т.н.
        int endIndex = beginIndex + maxLength;

        for (int i = beginIndex; i < endIndex; i++) {
            System.out.print(number[i] + " ");

        }

    }

}
