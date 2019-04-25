package ListsMoreExercises;

import java.util.Scanner;

public class BakingRushEXAM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String[] eventPairs = line.split("\\|");

        int energy = 100;
        int coins = 100;

        for (String eventPair : eventPairs) {  //сплитваме по ти ре за да ги отделим

            String[] eventOrIngredientWithValue = eventPair.split("-");

            switch (eventOrIngredientWithValue[0]) {
                case "rest":

                    int energyToGain = Integer.parseInt(eventOrIngredientWithValue[1]);

                    if (energy + energyToGain > 100) {
                        System.out.printf("You gained %d energy.%n", 100 - energy);
                        energy = 100;    // връщаме енергията в първоначалната и стойност
                    } else {
                        energy += energyToGain;
                        System.out.printf("You gained %d energy.%n", energyToGain);
                    }
                    System.out.printf("Current energy: %d.%n", energy);
                    break;
                case "order":

                    if (energy - 30 < 0) {
                        energy += 50;
                        System.out.println("You had to rest!");
                    } else {
                        energy -= 30;

                        int coinsToAdd = Integer.parseInt(eventOrIngredientWithValue[1]);
                        coins += coinsToAdd;
                        System.out.printf("You earned %d coins.%n", coinsToAdd);
                    }
                    break;

                default:
                    String ingredient = eventOrIngredientWithValue[0];
                    int price = Integer.parseInt(eventOrIngredientWithValue[1]);

                    coins -= price;

                    if (coins <= 0){
                        System.out.printf("Closed! Cannot afford %s.",ingredient);
                        return;
                    }else {
                        System.out.printf("You bought %s.%n",ingredient);
                    }

                        break;
            }
        }
        System.out.println("Day completed!");
        System.out.printf("Coins: %d%n",coins);
        System.out.printf("Energy: %d",energy);
    }

}
