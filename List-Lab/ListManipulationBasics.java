package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"end".equals(line)){
            String [] tokens = line.split("\\s+");
            String comand = tokens[0];
            if (comand.equals("Add")){
                int num = Integer.parseInt(tokens[1]);
                numbers.add(num);
            }else if (comand.equals("Remove")){
                int num = Integer.parseInt(tokens[1]);
                if (numbers.contains(num)){
                    numbers.remove(numbers.indexOf(num));
                }
            }else if (comand.equals("RemoveAt")){
                int index = Integer.parseInt(tokens[1]);
                numbers.remove(index);
            }else if (comand.equals("Insert")){
                int num = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                numbers.add(index,num);
            }

            line = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print( number + " ");
        }
    }
}
