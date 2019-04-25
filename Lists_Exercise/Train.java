package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] tokens = line.split("\\s+");

            String comand = tokens[0];
            if (comand.equals("Add")) {
                int passengers = Integer.parseInt(tokens[1]);
                wagons.add(passengers);
            } else {
                for (int i = 0; i <wagons.size() ; i++) {
                    int passengers = Integer.parseInt(line);
                    int pasInWagon = wagons.get(i);
                    if (capacity - pasInWagon >= passengers) {
                        wagons.set(i, pasInWagon + passengers);
                        break;
                    }
                }

//                wagons.stream().filter(w -> capacity - w >= passengers).findFirst().ifPresent(freeWagon -> {
//                    int indexFreeWagon = wagons.indexOf(freeWagon);
//                    wagons.set(indexFreeWagon,freeWagon + passengers);
//                });
            }
            line = scanner.nextLine();
        }
        wagons.forEach(w -> System.out.print(w + " "));
    }

}

