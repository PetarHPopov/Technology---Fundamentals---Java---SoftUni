package ArraysExercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] wagon = new int[n];
        int sumPassengers = 0;

        for (int i = 0; i < wagon.length; i++) {
            int passengers = Integer.parseInt(scan.nextLine());
            wagon[i] += passengers;
            sumPassengers+=wagon[i];
        }
        for (int passenger : wagon) {     // така само обхоьдаме масива ,това е същото като с for цимъл но s for може да ги променяме а с това само ги обхождаме
            System.out.print(passenger + " ");
        }
//        for (int i = 0; i <wagon.length ; i++) {
//
//            System.out.print(wagon[i] + " ");
//        }
        System.out.println();
        System.out.println(sumPassengers);
    }

}
