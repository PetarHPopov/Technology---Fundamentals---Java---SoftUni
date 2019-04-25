package ListsArraysAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverseDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(e -> e < 0);   // махаме всички отрицателни
        Collections.reverse(numbers);   // обръщаме колекцията

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {

//            for (Integer number : numbers) {
//                System.out.print(number + " ");
//            }  може и така да се прентират елементи те


            numbers.forEach(e -> System.out.print(e + " "));
        }
        numbers.removeAll(numbers.subList(1, 3));
        System.out.println(numbers);
    }

}
