package ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scan.nextLine());

            if (index >= 0 && index < pokemons.size()) {  //първо проверяваме инденса дали е в лист
                int element = pokemons.get(index);
                sum += element;
                pokemons.remove(index);

                changeListElements(pokemons, element);

            } else if (index < 0) {
                int element = pokemons.get(0); // взимаме първия елемент и на негово мшсто записваме стойноста на последния
                sum += element;
                pokemons.set(0,pokemons.get(pokemons.size()-1));

                changeListElements(pokemons,element);
            }else {
                int element = pokemons.get(pokemons.size()-1);
                sum += element;
                pokemons.set(pokemons.size()- 1 , pokemons.get(0));
                changeListElements(pokemons,element);
            }
        }
        System.out.println(sum);
    }

    public static void changeListElements(List<Integer> pokemons, int element) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i) <= element) {   // взимаме стойноста с get
                pokemons.set(i, pokemons.get(i) + element);  // променяме стойноста с set
            } else {
                pokemons.set(i, pokemons.get(i) - element);  // намаляваме стойноста
            }

        }
    }

}
