package ArraysLAB;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {


//        double[] money = new double[10];
//
//        money[0] = 10;
//        money[1] = 24;
//        money[2] = 12;
//        money[3] = 12.5;
//        money[4] = 33.33;
//        money[5] = 35;
//        money[6] = 145.60;
//        money[7] = 65;
//        money[8] = 5;
//        money[9] = 4.2;

        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        String[] moneyCandidate = input.split(" ");
        int moneyLength = moneyCandidate.length;
        double[] money = new double[moneyLength];
        for (int i = 0; i < moneyLength; i++) {
            String countCandidate = moneyCandidate[i];
            double coin = Double.parseDouble(countCandidate);
            money[i] = coin;

        }

//        int size = Integer.parseInt(scan.nextLine());
//        double[] money = new double[size];
//        for (int i = 0; i < money.length; i++) {
//            money[i] += Double.parseDouble(scan.nextLine());
//
//        }

        int starPosition = Integer.parseInt(scan.nextLine());

        double sum = money[starPosition];

        String direction = scan.nextLine();

        while (!"END".equals(direction)) {

            if (direction.equals("L")) {
                if (starPosition == 0) {
                    System.out.println("Cannot move left. Please move right.");
                } else {
                    starPosition--;
                    sum += money[starPosition];
                }
            } else if (direction.equals("R")) {
                if (starPosition == money.length - 1) {
                    System.out.println("Cannot move right. Please move left.");
                } else {
                    starPosition++;
                    sum += money[starPosition];
                }
            } else {
                System.out.println("Invalid direction.");
            }

            direction = scan.nextLine();
        }
        System.out.println(sum);


    }

}
