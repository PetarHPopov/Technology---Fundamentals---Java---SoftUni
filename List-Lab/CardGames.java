package ListsMoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumFirst = 0;
        int sumSecond = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int firstPlayerCard = firstDeck.get(0); // работим само с нулевия индекс които е първи за колекцията

            int secondPlayerCard = secondDeck.get(0);

            if (firstPlayerCard > secondPlayerCard) {

                firstDeck.remove(0);
                secondDeck.remove(0);

                firstDeck.add(firstPlayerCard);
                firstDeck.add(secondPlayerCard);

            } else if (firstPlayerCard < secondPlayerCard){

                firstDeck.remove(0);
                secondDeck.remove(0);

                secondDeck.add(secondPlayerCard);
                secondDeck.add(firstPlayerCard);
            }else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }

        for (Integer card : firstDeck) {
             sumFirst += card;
        }
        for (Integer card : secondDeck) {
            sumSecond+=card;
        }
        if (sumFirst> sumSecond){
            System.out.printf("First player wins! Sum: %d",sumFirst);
        }else {
            System.out.printf("Second player wins! Sum: %d",sumSecond);
        }
    }

}
