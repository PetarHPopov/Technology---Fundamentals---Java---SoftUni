package ListsArraysAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scan.nextLine();

        while (!"end".equals(line)) {

            String[] commands = line.split(" ");
            String cmd = commands[0];
            switch (cmd) {
                case "Add":
                    int numbersToAdd = Integer.parseInt(commands[1]);
                    numbers.add(numbersToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commands[1]);
                    numbers.remove(numberToRemove);

                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commands[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commands[1]);
                    int indexInsert = Integer.parseInt(commands[2]);
                    numbers.add(indexInsert, numberInsert);
                    break;
                default:
                    break;
            }

            line = scan.nextLine();
        }
        numbers.stream().forEach(e -> System.out.print(e + " "));
    }

}
