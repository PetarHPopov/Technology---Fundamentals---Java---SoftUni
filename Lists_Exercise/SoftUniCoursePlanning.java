package Lists_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> lessons = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toList());

        String line = reader.readLine();

        while (!"course start".equals(line)) {
            String[] tokens = line.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];

            if (command.equals("Add")) {
                if (!lessons.contains(lessonTitle)) {
                    lessons.add(lessonTitle);
                }
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < lessons.size()) {
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(index, lessonTitle);
                    }
                }
            } else if (command.equals("Remove")) {
                lessons.remove(lessonTitle);
            } else if (command.equals("Swap")) {
                String lessonTitle2 = tokens[2];
                String exercise = "-Exercise";
                if (lessons.contains(lessonTitle) && lessons.contains(lessonTitle2)) {
                    int index = lessons.indexOf(lessonTitle);
                    int index2 = lessons.indexOf(lessonTitle2);
                    lessons.set(index, lessonTitle2);
                    lessons.set(index2, lessonTitle);
                    if (lessons.contains(lessonTitle + exercise)) {
                        int index3 = lessons.indexOf(lessonTitle + exercise);
                        lessons.add(index2 + 1, lessonTitle + exercise);
                        lessons.remove(index3 + 1);
                    }
                    if (lessons.contains(lessonTitle2 + exercise)){
                        int index3 = lessons.indexOf(lessonTitle2 + exercise);
                        lessons.add(index + 1,lessonTitle2+exercise);
                        lessons.remove(index3 + 1);
                    }
                }
            } else if (command.equals("Exercise")) {
                String exercise = "-Exercise";
                if (!lessons.contains(lessonTitle)){
                    lessons.add(lessonTitle);
                    lessons.add(lessonTitle + exercise);
                }else if (!lessons.contains(lessonTitle + exercise)){
                    int index = lessons.indexOf(lessonTitle);
                    lessons.add(index + 1, lessonTitle + exercise);
                }

            }

            line = reader.readLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(i + 1 + "." + lessons.get(i));

        }
    }
}
