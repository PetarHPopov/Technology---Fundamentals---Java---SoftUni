package MapsLambdaАndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        LinkedHashMap<Character,Integer> countChar = new LinkedHashMap<>();

        for (int i = 0; i < text.length() ; i++) {

            char letter = text.charAt(i);
            if (letter != ' '){
                if (!countChar.containsKey(letter)){
                    countChar.put(letter,1);
                }else {
                    countChar.put(letter,countChar.get(letter) + 1);
                }
            }

        }
        for (Character letter : countChar.keySet()) {
            System.out.printf("%c -> %d%n",letter,countChar.get(letter));
        }
    }

}
