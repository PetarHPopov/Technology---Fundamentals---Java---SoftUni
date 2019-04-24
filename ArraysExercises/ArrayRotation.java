package ArraysExercises;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strNumbers = scan.nextLine().split(" ");

        int rotation = Integer.parseInt(scan.nextLine());

        rotation = rotation % strNumbers.length;

        for (int i = 0; i < rotation; i++) {

            String element = strNumbers[0];

            for (int j = 0; j < strNumbers.length - 1; j++) {  // въртин цикала до length - 1  защото последния няма с какво да го заменим
                strNumbers[j] = strNumbers[j + 1];

            }
            strNumbers[strNumbers.length - 1] = element; // на последния индекс от колекцията всеми запазания от нулевия елемент и го запиши на последна позиция
        }
        for (String s : strNumbers) {
            System.out.print(s + " ");
        }

    }

}
