package MethodsExercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        System.out.println(vowelsCount(text));
    }

    public static Integer vowelsCount(String s) {
        int counter = 0;

        String toLowerCase = s.toLowerCase(); //правим го целия стринг да е малки букви

        for (int i = 0; i <s.length() ; i++) {

            switch (toLowerCase.charAt(i)){
                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
            }

        }


        return counter;
    }

}
