package ListsMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class BakingFactoryEXAM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int maxSum = Integer.MIN_VALUE;
        double maxAvg = Double.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        int[] sequence = null;

        while (!"Bake It!".equals(line)) {

            int[] batch = Arrays.stream(line.split("#"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = Arrays.stream(batch).reduce((a, b) -> a + b).getAsInt();

            double avg = sum / (double) batch.length;

            if (sum > maxSum) {
                maxSum = sum;
                maxAvg = avg;
                minLength = batch.length;
                sequence = batch;

            } else if (sum == maxSum) {
                if (avg > maxAvg) {
                    maxSum = sum;
                    maxAvg = avg;
                    minLength = batch.length;
                    sequence = batch;
                } else if (avg == maxAvg){
                    if (batch.length < minLength){
                        maxSum = sum;
                        maxAvg = avg;
                        minLength = batch.length;
                        sequence = batch;
                    }
                }
            }
            line = scan.nextLine();
        }
        System.out.printf("Best Batch quality: %d%n",maxSum);
        Arrays.stream(sequence).forEach(e -> System.out.print(e + " "));
    }

}
