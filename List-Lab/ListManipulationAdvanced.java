package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("Contains")) {
                int num = Integer.parseInt(tokens[1]);
                if (numbers.contains(num)) {
                    System.out.print("Yes");
                } else {
                    System.out.print("No such number");
                }
            }else if (comand.equals("Print")){
                String cmd = tokens[1];
                if (cmd.equals("even")){
                    numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
                }else {

                    numbers.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
                }
            }else if (comand.equals("Get")) {
                numbers.stream().reduce((sum, num) -> sum + num).ifPresent(System.out::print);
            }else if (comand.equals("Filter")){
                String condition = tokens[1];
                if (condition.equals("<")) {
                    int num = Integer.parseInt(tokens[2]);
                    numbers.stream().filter(entry -> entry < num).forEach(e -> System.out.print(e + " "));
                }else if (condition.equals(">")){
                    int num = Integer.parseInt(tokens[2]);
                    numbers.stream().filter(entry -> entry > num).forEach(e -> System.out.print(e + " "));
                }else if (condition.equals(">=")) {
                    int num = Integer.parseInt(tokens[2]);
                    numbers.stream().filter(entry -> entry >= num).forEach(e -> System.out.print(e + " "));
                }else if (condition.equals("<=")) {
                    int num = Integer.parseInt(tokens[2]);
                    numbers.stream().filter(entry -> entry <= num).forEach(e -> System.out.print(e + " "));
                }
            }
            line = scanner.nextLine();
            System.out.println();
        }
    }
}
