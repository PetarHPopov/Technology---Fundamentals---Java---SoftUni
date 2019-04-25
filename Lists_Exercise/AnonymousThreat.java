package Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"3:1".equals(line)) {
            String[] tokens = line.split("\\s+");

            String command = tokens[0];
            if (command.equals("merge")) {

                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                startIndex = validateIndeh(startIndex, elements.size());
                endIndex = validateIndeh(endIndex, elements.size());

                String concatElement = String.join("", elements.subList(startIndex, endIndex + 1));

                elements.subList(startIndex, endIndex + 1).clear(); // за да махнем конкатенираните елементи
                elements.add(startIndex, concatElement);  //добавяме съединените три елемент на индех 0;

            } else if (command.equals("divide")) {

                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);

                List<String> result = divadeEquality(elements.get(index), partitions);
                //махаме последния елемент коуто е слепените порции
                elements.remove(index);
                // добавяме на индекса и колекцията от метода с разцепените порции
                elements.addAll(index, result);
            }

            line = scanner.nextLine();
        }
        System.out.println(String.join(" ", elements));
    }

    private static List<String> divadeEquality(String element, int partitions) {
        int part = element.length() / partitions;

        List<String> result = new ArrayList<>();

        while (element.length() >= part) {

            result.add(element.substring(0, part));  // добавяме първата изрязана част
            element = element.substring(part);   // така като няма краен индекс взимаме всичко след индекса

        }
        if (result.size() == partitions) {
            return result;
        } else {
            // ако дължината е нечетна трябва да вземем предпоследния елемент - er и към него да
            //конкатенираме последния елемент - d :  as ds fr er er d
            String concatTwoLastElements = result.get(result.size() - 2).concat(result.get(result.size() - 1));
            result.subList(result.size() - 2, result.size()).clear();
            result.add(concatTwoLastElements);
            return result;
        }
    }

    static int validateIndeh(int index, int length) {
        if (index < 0) {
            index = 0;
        }
        if (index > length - 1) {
            index = length - 1;
        }
        return index;
    }
}
