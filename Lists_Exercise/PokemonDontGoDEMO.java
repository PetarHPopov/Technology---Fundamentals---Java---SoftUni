package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGoDEMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemon = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!pokemon.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index > 0 && index < pokemon.size()) {
                int element = pokemon.get(index);
                sum += element;
                pokemon.remove(index);
                changeListElements(pokemon, element);
            }else if (index < 0){


            }
        }
    }

    private static void changeListElements(List<Integer> pokemon, int element) {
        for (int i = 0; i < pokemon.size(); i++) {
            if (pokemon.get(i) <= element) {
                pokemon.set(i, pokemon.get(i) + element);
            }else {
                pokemon.set(i,  pokemon.get(i) - element);
            }
        }
    }
}