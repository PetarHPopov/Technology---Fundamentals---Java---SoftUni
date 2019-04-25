package Lists_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int minLength = Math.min(first.size(), second.size());

        if (first.size() > second.size()) {

            List<Integer> wastElement = first.subList(minLength, first.size());

            for (int i = 0; i < minLength; i++) {
                result.add(first.get(i));
                result.add(second.get(second.size() - 1 - i));
            }
            sortedNumbersInTheList(result, wastElement);

        } else if (first.size() < second.size()) {
            Collections.reverse(second);
            List<Integer> wastElement = second.subList(minLength, second.size());

            for (int i = 0; i < minLength; i++) {
                result.add(second.get(i));
                result.add(first.get(i));
            }
            sortedNumbersInTheList(result, wastElement);
        }

        Collections.sort(result);
        System.out.println(result.toString().replaceAll("[\\[,\\]]", ""));
    }

    private static void sortedNumbersInTheList(List<Integer> result, List<Integer> wastElement) {
        int one = wastElement.get(0);
        int two = wastElement.get(1);

        int max = Math.max(one, two);
        int min = Math.min(one, two);

        result.removeIf(e -> e <= min);
        result.removeIf(e -> e >= max);

    }
}
