package MapsLambdaАndStreamAPIExercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, ArrayList<String>> map = new TreeMap<>();

        while (!"End".equals(line)) {

            String[] tokens = line.split(" -> ");

            String companyName = tokens[0];
            String employeeId = tokens[1];

            if (!map.containsKey(companyName)) {
                map.put(companyName, new ArrayList<>());
                map.get(companyName).add(employeeId);
            } else {
                if (!map.get(companyName).contains(employeeId))
                    map.get(companyName).add(employeeId);
            }

            line = scan.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());

            ArrayList<String> users = entry.getValue();

            for (String user : users) {
                System.out.println("-- " + user);
            }

        }
    }
}


