package ArraysLAB;

import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String firstText = scan.nextLine();
        String[] firstTextArray = firstText.split(" "); // разцепваме стринка с спейс защото
        // потребителя въвежда  a n n i e

        char[] first = new char[firstTextArray.length];// той в момента е празен и трябва с цикъл да го запълним

        for (int i = 0; i < first.length; i++) {
            first[i] = firstTextArray[i].charAt(0);  // така вече имаме напълнен чар масив
        }

        String secondText = scan.nextLine();
        String[] secondTextArray = secondText.split(" ");

        char[] second = new char[secondTextArray.length];

        for (int i = 0; i < second.length; i++) {
            second [i]=secondTextArray[i].charAt(0);

        }
        int smallestLength = Math.min(first.length, second.length);
        char[] smallest = first.length <= second.length
                ? first
                : second;  // с тернарен оператор вместо if  else
        char[] biggest = first.length > second.length
                ? first
                : second;

        for (int i = 0; i < smallestLength; i++) {
            if (first[i] < second[i]) {
//                smallest = first; може без тях защото ние горе сме ги задали да са така!!!
//                biggest = second;
                break;
            }
            if (first[i] > second[i]) {
                smallest = second;
                biggest = first;
                break;
            }
        }
        for (int i = 0; i < smallest.length; i++) {   //фор цикъл за да ги прентираме накрая
            System.out.print(smallest[i]);
        }
        System.out.println();
        for (int i = 0; i < biggest.length; i++) {
            System.out.print(biggest[i]);

        }
    }

}
