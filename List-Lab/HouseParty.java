package ListsMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayList <String> guests = new ArrayList<>();

        while (n-- > 0) {

            String line = scan.nextLine();

            String[] tokens = line.split("\\s+");

            String name = tokens[0];

            if (!line.contains("not")) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list");
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list");
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }

}
