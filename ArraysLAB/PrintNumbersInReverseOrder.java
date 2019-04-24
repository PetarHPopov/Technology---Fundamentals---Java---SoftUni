package ArraysLAB;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] number = new int[n];

        for (int i = 0; i < n ; i++) {    // тук пълним масива
            int input = Integer.parseInt(scan.nextLine());
            number[i]= input;
        }
        for (int i = number.length -1; i >=0 ; i--) { //тук го принтираме
            System.out.println(number[i]);
        }

    }

}
