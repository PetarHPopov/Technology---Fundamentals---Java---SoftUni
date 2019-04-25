package ListsMoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] tokens = scan.nextLine().split("\\s+");

        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

// почваме с търсене на бомбата

        while (numbers.contains(bomb)) {  // докато бомбата я има
            int index = numbers.indexOf(bomb);   //така намираме индекса на бомбата,ако съществува в колекцията

            int begin = index - power;
            begin = Math.max(0, begin);  // така си гарантираме че няма да излезем от листа намяво-отрицателно число
            for (int i = begin; i < index; i++) {  //  с цикъл започваме да ги махаме на ляво,до него че ще трябва и за другата страна
                numbers.remove(begin);
            }
            index = numbers.indexOf(bomb); // защото индекса се е променил след премахването на индекси и затова тршбва пак да го намерим на кой индекс е!!!

            int end = Math.min(index + power, numbers.size() - 1);
            for (int i = index; i <= end ; i++) { // от индекса защото и него искаме да махнем
                numbers.remove(index);
            }
        }
//        int sum = 0;
//        for (Integer number : numbers) {
//            sum +=number;
//        }
//        System.out.println(sum);
        numbers.stream().reduce((sum,element) -> sum + element).ifPresent(System.out::print);
    }

}
