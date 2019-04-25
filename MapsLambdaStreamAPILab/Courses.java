package MapsLambdaАndStreamAPIExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, ArrayList<String>> courses = new HashMap<>();

        while (!"end".equals(line)) {

            String[] tokens = line.split(" : ");

            String courseName = tokens[0];
            String studentName = tokens[1];

            courses.putIfAbsent(courseName,new ArrayList<>());
            courses.get(courseName).add(studentName)

            line = scan.nextLine();
        }


        courses.entrySet().stream().sorted((st1, st2) -> {

            int count2 = st2.getValue().size();
            int count1 = st1.getValue().size();

            if (count1 == count2) {
                return st1.getKey().compareTo(st2.getKey());
            }
            return Integer.compare(count2, count1);

        }).forEach(entry -> {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());

            Collections.sort(entry.getValue());

            entry.getValue().forEach(user -> System.out.println("-- " + user));
        });

    }

}


