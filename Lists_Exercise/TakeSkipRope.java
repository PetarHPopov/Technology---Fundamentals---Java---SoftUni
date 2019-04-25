package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<String> text = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                numbers.add((int) symbol - 48);
            } else {
                text.add("" + symbol);
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }

        String result = "";
        for (int i = 0; i < takeList.size(); i++) {

            int takeCount = takeList.get(i);
            int skipCount = skipList.get(i);

            if (takeCount + skipCount <= text.size()) {
                String concat = String.join("", text.subList(0, takeCount));
                result += concat;
                text.subList(0, takeCount + skipCount).clear();
            }else {
                String concatEnd= String.join("",text.subList(0,text.size()));
                result+= concatEnd;
            }
        }
        System.out.println(result);
    }
}
