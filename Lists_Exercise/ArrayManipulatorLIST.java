package Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayManipulatorLIST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"print".equals(line)) {
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("add")) {
                int index = Integer.parseInt(tokens[1]);
                int element = Integer.parseInt(tokens[2]);

                numbers.add(index, element);

            } else if (comand.equals("addMany")) {
                int index = Integer.parseInt(tokens[1]);
                List<Integer> numToAdd = new ArrayList<>();
                for (int i = 2; i < tokens.length; i++) {
                    numToAdd.add(Integer.parseInt(tokens[i]));
                }
                numbers.addAll(index, numToAdd);

            } else if (comand.equals("contains")) {
                int element = Integer.parseInt(tokens[1]);
                if (numbers.contains(element)) {
                    int indexElement = numbers.indexOf(element);
                    System.out.println(indexElement);
                } else {
                    System.out.println("-1");
                }
            } else if (comand.equals("remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                }
            } else if (comand.equals("shift")) {
                int positions = Integer.parseInt(tokens[1]);

                positions = positions % numbers.size();
                for (int i = 0; i < positions; i++) {
                    numbers.add(numbers.get(0));
                    numbers.remove(0);
                }
            } else if (comand.equals("sumPairs")) {
                for (int i = 0; i < numbers.size() - 1; i++) {
                    int sum = numbers.get(i) + numbers.get(i + 1);
                    numbers.set(i, sum);
                    numbers.remove(i + 1);
                }
            }


            line = scanner.nextLine();
        }
        System.out.println(numbers.toString());
    }
}
