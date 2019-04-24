package ArraysExercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");
        for (int i = 0; i < second.length ; i++) {
            for (int j = 0; j <first.length ; j++) {
                if (first[j].equals(second[i])){
                    System.out.print(second[i] + " ");
                    break;   // слага се break  защото като намери съвпадение не искам да продължи да търси по него а да се
                             // прехвърли на следващия елемент и така се намалява броя на Итерациите
                }

            }

        }
    }

}
