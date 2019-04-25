package ListsMoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> number = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scan.nextLine();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");
            String cmd = tokens[0];

            if ("Add".equals(cmd)) {
                int element = Integer.parseInt(tokens[1]);
                number.add(element);

            } else if ("Insert".equals(cmd)) {

                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < number.size()) {  // когато има инсерт се проверява индекса дали е в границите на масива
                    number.add(index, Integer.parseInt(tokens[1]));
                } else {
                    System.out.println("Invalid index");
                }

            } else if ("Remove".equals(cmd)) {
                int indexs = Integer.parseInt(tokens[1]);
                if (indexs >= 0 && indexs < number.size()) {
                    number.remove(indexs);
                } else {
                    System.out.println("Invalid index");
                }

            } else if ("Shift".equals(cmd)) {

                int count = Integer.parseInt(tokens[2]);

                count = count % number.size(); // оптимизираме брошча ако е 5 т.е 1 път въртим

                if (tokens[1].equals("left")) {
                    for (int i = 0; i < count; i++) {
                        number.add(number.get(0)); //вземи първия елемент и го добави( винаги add добавя накрая на колекцията)
                        number.remove(0);    // и след това махни първия индех
                    }
                } else {
                    for (int i = 0; i < count; i++) {
                        number.add(0, number.get(number.size() - 1));
                        number.remove(number.size() - 1);

                    }
                }
            }
            line = scan.nextLine();
        }
        for (Integer num : number) {
            System.out.print(num + " ");
        }
    }
}
