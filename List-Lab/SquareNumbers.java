package ListsArraysAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputNumbers  = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> squareNumber = new ArrayList<>();

        for (int number : inputNumbers) {
            if (Math.sqrt(number) == (int)(Math.sqrt(number))){
                squareNumber.add(number);
            }
        }
//        squareNumber.sort((n1,n2) -> Integer.compare(n2,n1));  моя прочит за сортиране и принтиране
//
//        for (Integer integer : squareNumber) {
//            System.out.print(integer + " ");
//        }
        squareNumber.stream()
                .sorted((e1, e2) -> Integer.compare(e2, e1)) //order in descending order
                .forEach(n -> System.out.printf("%d ", n));

    }

}
