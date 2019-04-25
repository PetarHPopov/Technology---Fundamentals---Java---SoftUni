package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstCard = firstPlayer.get(0);
            int secondCard = secondPlayer.get(0);

            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);

                firstPlayer.remove(0);
                secondPlayer.remove(0);

            } else if (firstCard < secondCard) {
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);

                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }
        int sumFirst = 0;
        int sumSecond = 0;

        for (Integer card : firstPlayer) {
            sumFirst += card;
        }

        for (Integer card : secondPlayer) {
            sumSecond += card;
        }
        if (sumFirst > sumSecond) {
            System.out.println(String.format("First player wins! Sum: %d", sumFirst));
        } else {
            System.out.println(String.format("Second player wins! Sum: %d", sumSecond));
        }
    }
}

