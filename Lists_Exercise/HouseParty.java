package Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < countGuests; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length > 3) {
                String name = tokens[0];
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(String.format("%s is not in the list!", name));
                }
            } else {
                String name = tokens[0];
                if (!guestsList.contains(name)) {
                    guestsList.add(name);
                } else {
                    System.out.println(String.format("%s is already in the list!", name));
                }
            }
        }

        for (String guest : guestsList) {
            System.out.println(guest);
        }
    }
}
