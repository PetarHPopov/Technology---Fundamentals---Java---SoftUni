package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double leftSum = 0, rightSum = 0;

        int length = numbers.size();

        for (int i = 0; i < length / 2; i++) {
            if (numbers.get(i) == 0){
                leftSum *= 0.8;
            }else {
                leftSum += numbers.get(i);
            }
        }
        for (int i = length - 1 ; i > length / 2 ; i--) {
            if (numbers.get(i) == 0){
                rightSum *= 0.8;
            }else {
                rightSum += numbers.get(i);
            }
        }
        if (leftSum < rightSum){
            System.out.println(String.format("The winner is left with total time: %.1f",leftSum));
        }else {
            System.out.println(String.format("The winner is right with total time: %.1f",rightSum));
        }
    }
}
