package ArraysExercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RoundingNumbersAwayfromZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < numbers.length; i++) {
            double rounded = roundNumber(i, numbers);
            DecimalFormat df = new DecimalFormat("#.##########");
            System.out.println(String.format("%s => %.0f",df.format(numbers[i]),rounded));
        }
    }

    private static double roundNumber(int index, double[] numbers) {
        double num = numbers[index];
        double absoluteValue = Math.abs(num);
        double increasedNumber = absoluteValue + 0.5;
        double truncatedToInteger = Math.floor(increasedNumber);

        if (num < 0){
            truncatedToInteger *= -1;
        }
        return truncatedToInteger;
    }
}
