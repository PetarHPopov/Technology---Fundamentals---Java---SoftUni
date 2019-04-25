package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scanner.nextLine();

        int index = 0;
        StringBuilder output = new StringBuilder();

        for (int num : numbers) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            index = sum;
            int length = text.length();

            if (index > length) {
                index = index % length;
            }
            String symbol = text.substring(index, index + 1);
            output.append(symbol);
            text = text.replaceFirst(symbol, "");

        }
        System.out.println(output);
    }

}

