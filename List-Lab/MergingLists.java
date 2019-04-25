package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
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

        int minSize = Math.min(first.size(),second.size());

        for (int i = 0; i < minSize ; i++) {
            result.add(first.get(i));
            result.add(second.get(i));
        }
        if (first.size() > second.size()){
            result.addAll(first.subList(minSize,first.size()));
        }else {
            result.addAll(second.subList(minSize,second.size()));
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
