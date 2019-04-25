package MapsLambdaАndStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");

            String cmd = tokens[0];

            if (cmd.equals("register")){
                String username = tokens[1];
                String licensePlateNumber = tokens[2];
                if (!map.containsKey(username)){
                    map.put(username,licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n",username,licensePlateNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s\n",licensePlateNumber);
                }
            }else if (cmd.equals("unregister")) {

                String username = tokens[1];
                if (!map.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found\n", username);
                } else {
                    map.remove(username);
                    System.out.printf("%s unregistered successfully\n", username);
                }
            }

        }
        for ( Map.Entry<String, String> name : map.entrySet()) {
            System.out.printf("%s => %s\n",name.getKey(),name.getValue());
        }

    }

}
