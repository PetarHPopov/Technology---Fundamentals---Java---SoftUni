package MethodsLAB;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        for (int i = 0; i < n ; i++) {
//            printTriangle(1,i);
//        }
//        printTriangle(1,n);
//
//        for (int i = n - 1; i >=0 ; i--) {
//            printTriangle(1,i);
//        }
//    }
//    private static void printTriangle(int begin, int end){
//        for (int i = begin; i <= end ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();


        for (int i = 1; i <=n ; i++) {
            printTriangle(i);
        }
        for (int i = n - 1; i >0 ; i--) {
            printTriangle(i);
        }
    }

    private static void printTriangle(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
