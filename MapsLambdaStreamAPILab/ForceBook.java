package MapsLambdaАndStreamAPIExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, List<String>> usersBySide = new HashMap<>();

        while (!"Lumpawaroo".equals(line)) {

           if (line.contains(" | ")){
               String[] tokens = line.split(" \\| ");

               String user = tokens[1];
               String side = tokens[0];
               usersBySide.putIfAbsent(side,new ArrayList<>());

               boolean exists = false;

               for(Map.Entry<String,List<String>> entry : usersBySide.entrySet()){
                   List<String> users = entry.getValue();
                   if (users.contains(user)){
                       exists = true;
                       break;
                   }
               }
               if (!exists){
                   usersBySide.get(side).add(user);
               }
           }else if (line.contains(" -> ")){
               String[] tokens = line.split(" -> ");

               String side = tokens[1];
               String user = tokens[0];

               for(Map.Entry<String,List<String>> entry : usersBySide.entrySet()){
                   List<String> users = entry.getValue();
                   if (users.contains(user)){
                       users.remove(user);
                       break;
                   }
               }
               usersBySide.get(side).add(user);

               System.out.printf("%s joins the %s side!\n",user,side);
           }

            line = scan.nextLine();
        }

        usersBySide.entrySet().stream().sorted((es1,es2)-> {  // така сортираме според каунта на потребителите
            int coun2 = es2.getValue().size();
            int coun1 = es1.getValue().size();
            if (coun1 == coun2){
                return es1.getKey().compareTo(es2.getKey());
            }
            return Integer.compare(coun2,coun1);
        }).forEach(entry -> {
            if (entry.getValue().size() == 0){
                return;
            }
            System.out.println(String.format("Side: %s, Members: %s",entry.getKey(),entry.getValue().size()));

            Collections.sort(entry.getValue());

            entry.getValue().forEach(user -> System.out.println("! " + user));
        });

    }

}
