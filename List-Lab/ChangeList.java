package ListsMoreExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());


        String line = scan.nextLine();

        while (!"end".equals(line)){
            String[]tokens = line.split(" ");
            String cmd = tokens[0];

            switch (cmd) {
                case "Delete":
                    int element = Integer.parseInt(tokens[1]);
                    // с ланда функция
                    //  numbers.removeIf(e -> e.equals(element));
                    // може да махнем елементите и с цикъл
                    while (numbers.contains(element)) {
                        numbers.remove(Integer.valueOf(element));
                    }
                    break;
                case "Insert":
                    int el = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);

                    if (position < numbers.size()) { // така правим проверка да добавя само ако това условие е вярно
                        numbers.add(position, el);
                    }
            }


            line = scan.nextLine();
        }
        numbers.stream().forEach(e -> System.out.print(e + " "));
    }

}
