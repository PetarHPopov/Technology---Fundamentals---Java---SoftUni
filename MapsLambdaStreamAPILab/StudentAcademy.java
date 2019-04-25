package MapsLambdaАndStreamAPIExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Double>> studentGrades = new LinkedHashMap<>();

        while (n-- > 0) {

            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!studentGrades.containsKey(name)) {
                studentGrades.put(name, new ArrayList<>());
                studentGrades.get(name).add(grade); //  studentGrades.get(name) е едно и също с new ArrayList<>() така го извикваме за да добавим оценка
            } else {
                studentGrades.get(name).add(grade);
            }
        }

        Map<String, Double> averageStudent = new LinkedHashMap<>(); //правим нов Map за да запазим оценките на всички студенти които са над 4.50

        for (String name : studentGrades.keySet()) {
            double sum = 0;
            for (int i = 0; i < studentGrades.get(name).size(); i++) {   // въртин цикъла по дължината на ArreaList и така взимаме всички оценки на студента
                sum += studentGrades.get(name).get(i);
            }
            double average = sum / studentGrades.get(name).size();

            if (average >= 4.5) { // няма да работи ако направим обратната проверка за да махаме от Листа защото така го оразмеряваме
                averageStudent.put(name, average);
            }
        }
        averageStudent.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue()));
    }

}
