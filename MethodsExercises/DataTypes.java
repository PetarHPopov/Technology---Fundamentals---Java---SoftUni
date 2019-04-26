package MethodsExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();
        String line = scanner.nextLine().toLowerCase();
        if (type.equals("int")) {
            System.out.println(foundresultInt( line));
        }else if (type.equals("real")){
            System.out.printf("%.2f",foundRealNumber(line));
        }else if (type.equals("string")){
            printStringType(line);
        }
    }

    private static void printStringType(String line) {
        if (line.length()>0) {
            System.out.println("$" + line + "$");
        }
    }

    private static double foundRealNumber( String line) {

        double num = Double.parseDouble(line);
        if (num > 0) {
            num *= 1.5;
        }
        return num;
    }

    static int foundresultInt( String line) {
        int number = Integer.parseInt(line);
        if (number > 0) {
            number *= 2;
        }
        return number;
    }
}
