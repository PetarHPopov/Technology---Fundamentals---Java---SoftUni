package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"end".equals(line)){
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("Delete")){
                int element = Integer.parseInt(tokens[1]);
                while (numbers.contains(element)){
                    numbers.remove(numbers.indexOf(element));
                }
            }else if (comand.equals("Insert")){
                int element = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index>= 0 && index<numbers.size()) {
                    numbers.add(index, element);
                }
            }


            line = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
