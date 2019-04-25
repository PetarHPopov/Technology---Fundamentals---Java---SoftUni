package MapsLambdaStreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, Integer> number = new TreeMap<>();

        List<Integer> elements = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer element : elements) {
            if (!number.containsKey(element)) {
                number.put(element, 0);
            }
            number.put(element, number.get(element) + 1);
        }

        number.forEach((key, value) -> System.out.println(String.format("%d -> %d", key, value)));
//        number.entrySet().stream().sorted((a,b) -> {
//            if (b.getValue() - a.getValue() == 0){
//                return b.getKey() - a.getKey();
//            }else{
//                return b.getValue() - a.getValue();
//            }
//        }).forEach(entry -> System.out.println(String.format("%d -> %d",entry.getKey(),entry.getValue())));
    }
}
