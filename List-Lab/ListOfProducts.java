package Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < countProducts; i++) {
            String nameProducts = scanner.nextLine();
            products.add(nameProducts);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size() ; i++) {
            System.out.println(i+1 + "." + products.get(i));
        }
    }
}
