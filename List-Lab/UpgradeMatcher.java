package ListsMoreExercises;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpgradeMatcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] products = scan.nextLine().split(" ");

        long[] quantities = Arrays.stream(scan.nextLine().split(" "))
                .mapToLong(Long::parseLong).toArray();

        double[] prices = Arrays.stream(scan.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();
// правим си два мапа
        Map<String, Long> quantitiesBuProducts = new HashMap<>();

        Map<String, Double> pricesByProducts = new HashMap<>();

// след това ги напълваме

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            // ако няма такъв индекс в количеството слагаме нула
            if (i >= quantities.length){
                quantitiesBuProducts.put(product,0L);
            }else {
                quantitiesBuProducts.put(product, quantities[i]);
            }
            pricesByProducts.put(product, prices[i]);
        }

        String productAndPrice = scan.nextLine();

        while (!productAndPrice.equals("done")) {

            String[] productPair = productAndPrice.split(" ");

            String product = productPair[0];

            long quantity = Integer.parseInt(productPair[1]);

// проверяваме дали имаме толкова продукти,ако нямаме

            long oldQuantity = quantitiesBuProducts.get(product);

            if ( oldQuantity< quantity){
                System.out.printf("We do not have enough %s%n",product);
            }else { // ако имаме отпечатваме продукта,количеството и цената взета от мапа по количеството

                System.out.printf("%s x %d costs %.2f\n",product,quantity,pricesByProducts.get(product) * quantity);
                //и намаляваме продуктите с толкова колкото сме купили
                quantitiesBuProducts.put(product,oldQuantity - quantity);
            }

            productAndPrice = scan.nextLine();
        }

    }

}
