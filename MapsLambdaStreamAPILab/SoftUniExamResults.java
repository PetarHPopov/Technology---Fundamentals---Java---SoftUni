package MapsLambdaАndStreamAPIExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, Integer> user = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();

        while (!"exam finished".equals(line)) {

            String[] tokens = line.split("-");

            String name = tokens[0];
            String courses = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            if (tokens.length == 3) {
                if (!user.containsKey(name)) {
                    user.put(name, points);
                } else if (user.get(name) < points) {
                    user.put(name, points);
                }
                if (!submissions.containsKey(courses)) {
                    submissions.put(courses, 1);
                } else {
                    submissions.put(courses, submissions.get(courses) + 1);
                }
            } else {
                user.remove(name);
            }

            line = scan.nextLine();
        }
        System.out.println("Results:");

        user.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(String.format("%s | %d", entry.getKey(), entry.getValue())));

        System.out.println("Submissions:");

         submissions.entrySet().stream()
                 .sorted(Map.Entry.<String,Integer>comparingByValue()
                         .reversed().thenComparing(Map.Entry.comparingByKey()))
                 .forEach(entry -> System.out.println(String.format("%s - %d",entry.getKey(),entry.getValue())));

    }

}
