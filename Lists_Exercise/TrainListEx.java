package ListsArraysAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainListEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String line = scan.nextLine();

        while (!"end".equals(line)) {
            String[] tokens = scan.nextLine().split(" ");

            if (tokens[0].equals("Add")) {
                int newWagon = Integer.parseInt(tokens[1]); //така получаваме новиш вагон
                wagons.add(newWagon);   // към вагоните добавяме новия вагон
            } else {
                int passengers = Integer.parseInt(tokens[0]);
//                for (int i = 0; i < wagons.size() ; i++) {   правим го с цикъл ако искаме пътниците да се прехвърлят от вагона до макса на следващия
//                    int wagon = wagons.get(i);        // взимаме колко пътника е напълнил съответния вагон
//                    if (maxCapacity -wagon >= passengers){    // ако можем да ги съберем вътре
//                        wagons.set(i,wagon + passengers);      // ги слагаме
//                        break;                                 // прекъсваме цикъла защото няма смисъл да минаваме на следващия вагон
//                    }else {                                  // ако не можем да ги съберем
//                        wagons.set(i,maxCapacity);          //този вагон го пълним до край
//                        passengers -= (maxCapacity - wagon);  // и пасаьерите намаляват и пак се завърта цикъла докато
//                    }                                           // не влезнем в горния if и не break цикъла
//                }
                wagons.stream().filter(w -> maxCapacity - w >= passengers)
                       .findFirst()                // намираме първия вагон числото извадено от капацитета
                       .ifPresent(freeWagon -> {       // ако има такъв елемент ... вземифо този елемент
                           int indexOfFreeWagon = wagons.indexOf(freeWagon); // изпълни дадената функция
                           wagons.set(indexOfFreeWagon, freeWagon + passengers);
                       });
            }

            line = scan.nextLine();
        }
        wagons.forEach(w -> System.out.print(w + " "));

    }

}
