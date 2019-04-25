package ListsMoreExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String line = scan.nextLine();

        while (!"course start".equals(line)) {

            String[] courses = line.split(":");
            String operation = courses[0];
            String course = courses[1];

            if (operation.equals("Add")) {
                if (!input.contains(course)) {
                    input.add(course);
                }
            } else if (operation.equals("Insert")) {

                int index = Integer.parseInt(courses[2]);

                if (index >= 0 && index < input.size()) {
                    if (!input.contains(course)) {
                        input.add(index, course);
                    }
                }
            }else if (operation.equals("Remove")){

                if (input.contains(course)){
                    input.remove(course);
                }
            }else if (operation.equals("Swap")){
                String token = courses[2];

                int position = input.indexOf(course);
                int swapedPosition = input.indexOf(token);

                String exerciseCourse = course+"-Exercise";
                String exerciseToken = token+"-Exercise";

                if (input.contains(exerciseCourse)){

                    Collections.swap(input,position,swapedPosition);
                    input.remove(exerciseCourse);
                    input.add(position + 1,exerciseCourse);

                }else if (input.contains(exerciseToken)){

                    Collections.swap(input,position,swapedPosition);
                    input.remove(exerciseToken);
                    input.add(input.indexOf(token)+ 1,exerciseToken);

                }else {

                    Collections.swap(input,position,swapedPosition);
                }

            }else if (operation.equals("Exercise")){

                if (!input.contains(course)){
                    input.add(course);
                    input.add(course + "-Exercise");
                }else {
                    int position = input.indexOf(course) + 1;
                    if (position>=0 && position<input.size()) {
                        input.add(position, course + "-Exercise");
                    }
                }
            }
            line = scan.nextLine();
        }
        for (int i = 0; i <input.size() ; i++) {
            System.out.println(i+1 + "." + input.get(i));

        }

    }

}
