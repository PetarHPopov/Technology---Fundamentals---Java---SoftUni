package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SnowMen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] snowmen = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        while (snowmen.length > 1) {
            int alive = snowmen.length;  //така броим живите и всеки път като омира някой вадим от живите
            for (int i = 0; i < snowmen.length && alive > 1; i++) { // правим дпълнително условие за да проверим дали не са се избили всички
                int attackerIndex = i;
                int attackerValue = snowmen[attackerIndex];
                if (attackerValue == -1) {
                    continue;
                }
                int targetIndex = attackerValue % snowmen.length;
                if (targetIndex == attackerIndex) {
                    System.out.printf("%d performed harakiri", attackerIndex);
                    snowmen[attackerIndex] = -1; // сторйноста е -1 защото се е самоубил и така го махаме от масива
                    alive--;
                    continue;
                }
                int difference = Math.abs(attackerIndex - targetIndex);
                System.out.printf("%d x %d -> ", attackerIndex, targetIndex);
                if (difference % 2 == 0) {
                    System.out.printf("%d wins\n", attackerIndex);
                    if (snowmen[targetIndex]== -1){
                        continue;
                    }
                    snowmen[targetIndex] = -1;  // единия печели и другия умира
                    alive--;
                } else {
                    System.out.printf("%d wins\n", targetIndex);
                    if (snowmen[attackerIndex]== -1){
                        continue;
                    }
                    snowmen[attackerIndex] = -1;
                    alive--;
                }
                if (alive <= 1){
                    break;
                }
            }
            int[] aliveSnowmen = new int[alive];
            int next = 0;
            for (int i = 0; i <snowmen.length ; i++) { //минаваме през всички стари елементи
                if (snowmen[i] != -1){            // и ако този елемент не е умрял
                    aliveSnowmen[next] =snowmen[i];  // го вкарваме при живите - новия масив но на следваща позиция
                    next++;                       //затова увеличаваме next
                }
                
            }
            snowmen = aliveSnowmen;  // като напълним новия масив следва стария да бъде заменен и да почне пак
                                       // да цикли в While цикъла с новия масив


        }
    }

}
