package ListsMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        String line = scan.nextLine();

        while (line.equals("3:1")) {
            String[] tokens = line.split(" ");
            String cmd = tokens[0];
            int start = Math.min(Integer.parseInt(tokens[1]), elements.size() - 1);
            start = Math.max(0, start); // ако ни подадът отрицателно да се взима положителното
            int end = Integer.parseInt(tokens[2]);

            List<String> result = new ArrayList<>();

            if (cmd.equals("marge")) {

                end = Math.min(Integer.parseInt(tokens[2]), elements.size() - 1);
                end = Math.max(0, end);

                if (start > 0) {
                    result.addAll(elements.subList(0, start));
                }
                String merged = elements.subList(start, end + 1)
                        .stream()
                        .reduce((res, el) -> res + el)
                        .get();
                result.add(merged);

                if (end + 1 < elements.size()) {
                    elements.subList(end + 1, elements.size());
                }
                elements = result;

            } else {
                String element = elements.get(start);
                end = Math.min(end, element.length()); // защото неможе пример седм синволен них да го разцепеш на осем части
                int symbols = element.length() / end;
                int lastElementLength = symbols + element.length() % end;
                int parts = element.length() - lastElementLength;
                String lastElement = element.substring(element.length() - lastElementLength);
                element = element.substring(0,element.length() - lastElementLength);
                for (int i = 0; i < parts && element.length() > 0; i++) {

                    result.add(element.substring(0, symbols));
                    element = element.substring(symbols);
                }
                if (!element.isEmpty()) {
                    result.add(element);
                }
                if (!lastElement.isEmpty()){
                    result.add(lastElement);
                }
                elements.remove(start);
                elements.addAll(start, result);
            }


            line = scan.nextLine();
        }
        elements.forEach(e -> System.out.println(e + " "));

    }

}
