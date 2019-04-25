package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("Add")) {
                int num = Integer.parseInt(tokens[1]);
                numbers.add(num);
            } else if (comand.equals("Insert")) {
                int num = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, num);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (comand.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (comand.equals("Shift")) {
                String side = tokens[1];
                int count = Integer.parseInt(tokens[2]);
                count = count % numbers.size();
                if (side.equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int element = numbers.get(0);
                        numbers.add(element);
                        numbers.remove(0);
                    }
                }else {
                    for (int i = 0; i < count; i++) {
                        int element = numbers.get(numbers.size()-1);
                        numbers.add(0,element);
                        numbers.remove(numbers.size()-1);
                    }
                }
            }
            line = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
