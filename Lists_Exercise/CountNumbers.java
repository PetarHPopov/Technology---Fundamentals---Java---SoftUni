package ListsArraysAdvanced;

import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbers);
      
        List<Integer>distinct = new ArrayList<>();

        for (Integer number : numbers) {
            if (!distinct.contains(number)){
                distinct.add(number);
            }
        }
        for (Integer uniqueNumber : distinct) {
            int counter = 0;

            for (Integer number : numbers) {
                if (uniqueNumber.equals(number)){ // с == не минава 83/100 с equales - защото се сравняват обекти
                    counter ++;
                }
            }
            System.out.print(String.format("%d -> %d\n",uniqueNumber,counter));
        }

    }

}
