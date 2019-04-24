package ArraysLAB;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        String[] stuff = new String[size];

        while (true) {

            String positionCandidate = scan.nextLine();

            if (positionCandidate.equals("END")) {
                break;
            }
            int position = Integer.parseInt(positionCandidate);
            String item = scan.nextLine();

            if (position > stuff.length - 1 || position < 0) {
                System.out.println("Invalid position. Try again!");
                // може с continue; вместо else
            } else {
                stuff[position] = item;// така пълним масива със въведените позиция и
                                      // стринга на тази позиция -
                //stuff[position] = item;- масив от позиция е равен на някакъв елемент

            }
        }
        String line = scan.nextLine();

        while (!"END".equals(line)) {

            int position = Integer.parseInt(line);

            if (position > stuff.length - 1 || position < 0) {
                System.out.println("Invalid position. Try again!");
            } else {

                String item = stuff[position];  // за да извадим еламента от масива
                                               //Масив от позиция ни дава този елемент
                if (item != null) { // прави се проверка защото като не си го запълнил позицията с елемент няма как да я извличаш
                    System.out.println(item.substring(Math.min(3,item.length()-1), Math.min(5, item.length()))); // и взимане от 3 до последния синвол със substring!.С Math.min защото искаме до 5 но ако стринга е 4 да ни доде до дължината му
                }else {
                    System.out.println("Invalid item. You have set one on the that position.");
                }
            }
            line = scan.nextLine();
        }


    }

}
