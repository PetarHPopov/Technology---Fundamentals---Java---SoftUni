package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        matPow( num, pow);
    }

    private static void matPow(double num , int pow) {
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(String.format("%s",df.format(Math.pow(num,pow))));

    }
}
