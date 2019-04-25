package ListsMoreExercises;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InvertoryMotcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] products = scan.nextLine().split(" ");

        int[] quantities = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        double[] prices = Arrays.stream(scan.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();
// правим си два мапа
        Map<String, Integer> quantitiesBuProducts = new HashMap<>();

        Map<String, Double> pricesByProducts = new HashMap<>();

// след това ги напълваме

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            quantitiesBuProducts.put(product, quantities[i]);
            pricesByProducts.put(product, prices[i]);
        }

        String product = scan.nextLine();
        while (!product.equals("done")){
            DecimalFormat df = new DecimalFormat("0.0000");
            System.out.printf("%s costs: %s; Available quantity: %d"
                    ,product
                    ,df.format(pricesByProducts.get(product))
                    ,quantitiesBuProducts.get(product));

            product = scan.nextLine();
        }
    }

}
