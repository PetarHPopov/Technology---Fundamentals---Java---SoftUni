package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] tokens = scanner.nextLine().split("\\s+");

        int bomb = Integer.parseInt(tokens[0]);
        int powerBomb = Integer.parseInt(tokens[1]);

        while (numbers.contains(bomb)) {
            int indexBomb = numbers.indexOf(bomb);

            int begin = indexBomb - powerBomb;
            begin = Math.max(0, indexBomb - powerBomb);

            for (int i = begin; i < indexBomb; i++) {
                numbers.remove(begin);
            }
            indexBomb = numbers.indexOf(bomb);

            int end = indexBomb + powerBomb;
            end = Math.min(indexBomb + powerBomb, numbers.size() - 1);

            for (int i = indexBomb; i <= end; i++) {
                numbers.remove(indexBomb);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
