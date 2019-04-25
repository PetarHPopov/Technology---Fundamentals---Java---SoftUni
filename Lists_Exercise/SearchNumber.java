package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int countElement = tokens[0];
        int countClearElement = tokens[1];
        int number = tokens[2];

        numbers = numbers.subList(0, countElement);

        numbers.subList(0, countClearElement).clear();


        if (numbers.contains(number)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

    }
}
