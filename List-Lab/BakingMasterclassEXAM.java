package ListsMoreExercises;

import java.util.Scanner;

public class BakingMasterclassEXAM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int student = Integer.parseInt(scan.nextLine());

        double priceFlour = Double.parseDouble(scan.nextLine());
        double priceEggs = Double.parseDouble(scan.nextLine());
        double priceApron = Double.parseDouble(scan.nextLine());

        int allFlour = student - (student / 5); //така ще получим че всяка 6-та пристилка е безплатна
        int allEggs = 10 * student;
        int aprons = (int) Math.ceil(student * 1.2);

        double allPrice = (priceFlour* allFlour) + (priceEggs * allEggs) + (priceApron * aprons);

        if (allPrice <= budget ){
            System.out.printf("Items purchased for %.2f$.",allPrice);
        }else {
            System.out.printf("%.2f$ more needed.",Math.abs(budget - allPrice));
        }


    }

}
