package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumReversedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int rev = 0;
            int number = numbers.get(i);

            while (number > 0) {
                int digit = number % 10;
                rev = rev * 10 + digit;
                number /= 10;
            }
            sum += rev;

        }

        System.out.println(sum);
    }
}
