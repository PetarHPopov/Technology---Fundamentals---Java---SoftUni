package ListsArraysAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSetExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         money = Double.parseDouble(scan.nextLine());

        List<Integer> drums = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

// правим си друг списък който ще ни дърьи цената която е по три

        List<Double> prices = drums.stream().map(e -> e * 3d).collect(Collectors.toList());

        String line = scan.nextLine();

        while (!line.equals("Hit it again, Gabsy!")) {

            int power = Integer.parseInt(line);

            // след като са ни подали силата на удряне следва да намалим всички удари със силата

            for (int i = 0; i < drums.size(); i++) {
                if (drums.get(i) == Integer.MIN_VALUE) {  // барабана който не можем да си го позволим
                                                          // ако минем праз него пак да не го удряме защото той е все едно мъртав за нас
                    continue;
                }
                drums.set(i, drums.get(i) - power);

                if (drums.get(i) <= 0) {

                    double price = prices.get(i);

                    if (money >= price) {
                        money -= price;

                        drums.set(i, (int) price / 3);
                    } else {
                        drums.set(i, Integer.MIN_VALUE);  //всеки барабан който не можем да си го позволим
                                                          // го слагаме на някаква стойност
                    }
                }
            }
            line = scan.nextLine();
        }
        drums.stream().filter(e -> e != Integer.MIN_VALUE)
                .forEach(d -> System.out.print(d + " "));
        System.out.printf("\nGabsy has %.2flv.", money);
    }

}
