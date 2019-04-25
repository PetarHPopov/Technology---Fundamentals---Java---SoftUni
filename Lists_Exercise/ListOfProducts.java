package ListsArraysAdvanced;

import javafx.print.Collation;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
//            String line = scan.nextLine();
//            products.add(line);
            products.add(scan.nextLine());  // така е по сакратено направи добавяме линията без да я запазваме в променлива
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {

            System.out.println((i + 1) + "." + products.get(i));

        }

    }

}
