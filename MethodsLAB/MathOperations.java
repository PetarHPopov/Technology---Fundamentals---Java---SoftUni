package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(String.format("%s",df.format(calculate(a, operator, b))));

    }

    static double calculate(int a, String operator, int b) {
        double sum = 0.0;
        if (operator.equals("/")) {
            sum = a * 1.0 / b;
        } else if (operator.equals("*")) {
            sum = a * b;
        } else if (operator.equals("+")) {
            sum = a + b;
        }else if (operator.equals("-")){
            sum = a- b;
        }
        return sum;
    }
}
