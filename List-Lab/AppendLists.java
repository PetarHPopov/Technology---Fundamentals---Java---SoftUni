package ListsArraysAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class AppendLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //first we split by our list separator
        String[] input = scan.nextLine().split("\\|");

        List<String> list = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            //extract numbers of each list
            String[] tokens = input[i].trim().split("\\s+");

            //addAll -> joint two collections
            // list (3, 4, 5).addAll(tokens(2,8)) -> list (3, 4, 5, 2, 8)
            list.addAll(Arrays.asList(tokens));
        }

        System.out.println(String.join(" ", list));
    }

}
