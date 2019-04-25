package Lists_Exercise;

        import java.util.*;
        import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numString = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(numString);

        String printList = numString.toString().replaceAll("[\\[\\],]", "");

        printList = printList.replaceAll("\\s+", " ").trim();

        System.out.println(printList);
    }
}
