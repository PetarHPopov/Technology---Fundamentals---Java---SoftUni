package MapsLambdaАndStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Double> productsAndPrice = new LinkedHashMap<>();
        Map<String, Integer> productsAndQuantity = new LinkedHashMap<>();

        String line = scan.nextLine();

        double sum = 0.0;

        while (!"buy".equals(line)) {

            String[] tokens = line.split(" ");

            String products = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!productsAndPrice.containsKey(products)) {
                productsAndPrice.put(products, price);
                productsAndQuantity.put(products, 0);
            }
            if (price != productsAndPrice.get(products)) {
                productsAndPrice.put(products, price);
            }
            productsAndQuantity.put(products, productsAndQuantity.get(products) + quantity);

            line = scan.nextLine();
        }
        for (String product : productsAndPrice.keySet()) {
            
            double price = productsAndPrice.get(product);
            int quantity = productsAndQuantity.get(product);

            sum = price * quantity;

            System.out.printf("%s -> %.2f\n",product,sum);
        }
    }
}




