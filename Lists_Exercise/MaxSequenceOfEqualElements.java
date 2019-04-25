package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int index = 0;
        int bestLength = 1;
        int count = 1;

        for (int i = 0; i < line.size() - 1; i++) {

            if (line.get(i).equals(line.get(i + 1))) {
                count++;
            } else {
                count = 1;

            }
            if (count > bestLength) {
                bestLength = count;
                index = i + 1;
            }
        }

        int start = (index - bestLength) + 1;
       line = line.subList(start, start + bestLength);
        System.out.println(line.toString().replaceAll("[\\[,\\]]", ""));
    }
}
