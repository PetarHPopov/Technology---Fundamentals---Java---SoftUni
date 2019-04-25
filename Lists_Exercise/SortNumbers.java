package ListsArraysAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       String line = scan.nextLine();
       String[] tokens = line.split(" ");
       List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }
        Collections.sort(numbers);

        for (int i = 0; i < numbers.size() ; i++) {
            if (i == numbers.size() - 1){
                System.out.print(numbers.get(i));
            }else {
                System.out.printf("%d <= ",numbers.get(i));
            }

        }
    }

}
