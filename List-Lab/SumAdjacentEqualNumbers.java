package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size()- 1 ; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i,numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i=-1;
            }
        }
        for (Integer number : numbers) {
            System.out.print( number + " ");
        }
    }
}
