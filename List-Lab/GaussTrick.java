package ListsArraysAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < numbers.size() - 1; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
          numbers.remove(i);
          numbers.remove(numbers.size()-1);
          numbers.add(i,sum);
        }
       numbers.stream().forEach(e -> System.out.print(e + " "));
    }

}
