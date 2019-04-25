package MapsLambdaАndStreamAPIExercise;

import java.util.*;

 class Dwarf {
    private String name;
    private String color;
    private int physics;

    public Dwarf(String name, String color, int physics) {
        this.name = name;
        this.color = color;
        this.physics = physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPhysics() {
        return physics;
    }
}

public class Snowwhite {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Dwarf> dwarves = new ArrayList<>();
        Map<String,Integer> countsByColor = new HashMap<>();

        String line = scan.nextLine();

        while (!line.equals("Once upon a time")) {

            String[] tokens = line.split(" <-> ");
            String name = tokens[0];
            String color = tokens[1];
            int physics = Integer.parseInt(tokens[2]);

            Optional<Dwarf> dwarfCandidate = dwarves.stream().filter(dwarf -> dwarf.getName().equals(name) && dwarf.getColor().equals(color))
                    .findFirst();
            if (dwarfCandidate.isPresent()){
                Dwarf dwarf = dwarfCandidate.get();
                if (dwarf.getPhysics()<physics){
                    dwarf.setPhysics(physics);
                }
            }else {
                Dwarf dwarf = new Dwarf(name,color,physics);
                countsByColor.putIfAbsent(color,0);
                countsByColor.put(color,countsByColor.get(color) +1);
                dwarves.add(dwarf);
            }


            line = scan.nextLine();
        }
        dwarves.sort((dwarf1,dwarf2)->{
            int physics2 = dwarf2.getPhysics();
            int physics1 = dwarf1.getPhysics();
            if (physics1 == physics2){
                return countsByColor.get(dwarf2.getColor()).compareTo(
                        countsByColor.get(dwarf1.getColor())
                );
            }
            return Integer.compare(physics2,physics1);
        });
        dwarves.forEach(dwarf -> System.out.printf("(%s) %s <-> %d%n",dwarf.getColor(),dwarf.getName(),dwarf.getPhysics()));

//        Map<String, Integer> physicsByNameAndColor = new LinkedHashMap<>();
//        Map<String, Integer> countByColor = new LinkedHashMap<>();
//
//        String line = scan.nextLine();
//
//        while (!"Once upon a time".equals(line)) {
//
//            String[] tokens = line.split(" <:> ");
//
//            String name = tokens[0];
//            String color = tokens[1];
//            int physics = Integer.parseInt(tokens[2]);
//
//            countByColor.putIfAbsent(color, 0);
//
//            String nameAndColor = color + ":" + name;
//
//            if (physicsByNameAndColor.containsKey(nameAndColor)) {
//                if (physicsByNameAndColor.get(nameAndColor) < physics) {
//                    physicsByNameAndColor.put(nameAndColor, physics);
//                }
//            } else {
//                physicsByNameAndColor.put(nameAndColor, physics);
//                countByColor.put(color, countByColor.get(color) + 1);
//            }
//
//            line = scan.nextLine();
//        }
//        physicsByNameAndColor.entrySet().stream().sorted(
//                (es1, es2) -> {
//                    Integer physics2 = es2.getValue();
//                    Integer physics1 = es1.getValue();
//                    if (physics1.equals(physics2)) {
//
//                        String key1 = es1.getKey();
//                        String key2 = es2.getKey();
//
//                        String color1 = key1.split(":")[0];
//                        String color2 = key2.split(":")[0];
//
//                        Integer count1 = countByColor.get(color1);
//                        Integer count2 = countByColor.get(color2);
//
//                        return Integer.compare(count2, count1);
//
//                    }
//                    return Integer.compare(physics2, physics1);
//                }
//        ).forEach(
//                es -> {
//                    String[] colorAndname = es.getKey().split(":");
//                    Integer physics = es.getValue();
//
//                    System.out.printf("(%s) %s <-> %d%n", colorAndname[0], colorAndname[1], physics);
//                }
//        );
    }
}
