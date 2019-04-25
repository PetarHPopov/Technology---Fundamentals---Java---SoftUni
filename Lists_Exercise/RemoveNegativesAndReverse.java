package ListsArraysAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 0) {
                numbers.remove(i);
                i--;
            }
        }
        if (numbers.size() > 0) {
            Collections.reverse(numbers);
            for (Integer number : numbers) {
                System.out.printf("%d ", number);
            }
        } else {
            System.out.println("empty");
        }
    }

}
