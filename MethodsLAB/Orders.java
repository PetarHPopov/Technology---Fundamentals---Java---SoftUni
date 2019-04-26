package MethodsLAB;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        int quantity = Integer.parseInt(scanner.nextLine());

        printPrice(product, quantity);
    }

    private static void printPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.5 * quantity;
                break;
            case "water":
                price = 1.0 * quantity;
                break;
            case "coke":
                price = 1.40 * quantity;
                break;
            case "snacks":
                price = 2.0 * quantity;
                break;
            default:
                break;
        }
        System.out.println(String.format("%.2f", price));
    }
}
