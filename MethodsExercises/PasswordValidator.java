package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (validatePassword(pass)){
            System.out.println("Password is valid");
        }
    }

   private static boolean validatePassword(String pass) {
       boolean correctCharCount = validateCount(pass);
       boolean onlyLettersAndDigits = validateContain(pass);
       boolean haveToDigits = validateDigitsCount(pass);

       return correctCharCount && onlyLettersAndDigits && haveToDigits;
    }

    private static boolean validateDigitsCount(String pass) {

        int countDigits = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (Character.isDigit(symbol)) {
                countDigits++;
                if (countDigits >= 2) {
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;

    }


    private static boolean validateContain(String pass) {

        for (int i = 0; i < pass.length(); i++) {

            char symbol = pass.charAt(i);

            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    private static boolean validateCount(String pass) {
        boolean isValid = pass.length() > 5 && pass.length() < 11;

        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}
