package MapsLambdaАndStreamAPIExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();

        Map<String, Integer> map = new HashMap<>();

        while (!"end".equals(resource)) {

            int quantity = Integer.parseInt(scan.nextLine());

            if (!map.containsKey(resource)) {
                map.put(resource, quantity);
            } else {
                map.put(resource, map.get(resource) + quantity);
            }
            resource = scan.nextLine();
        }
        map.entrySet().stream().forEach(res -> System.out.printf("%s -> %d\n",res.getKey(),res.getValue()));
    }

}


