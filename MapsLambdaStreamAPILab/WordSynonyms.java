package MapsLambdaStreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class WordSynonyms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String,List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = reader.readLine();
            String synonym = reader.readLine();

            synonyms.putIfAbsent(word,new ArrayList<>());
            synonyms.get(word).add(synonym);

        }
//        synonyms.forEach((key, value) -> {
//            System.out.print(key + " - ");
//            System.out.print(String.join(", ", value));
//            System.out.println();
//        });
        synonyms.forEach((word,synonym)->{
            System.out.print(String.format("%s - ",word));
            System.out.println(String.join(", ",synonym));
        });
    }
}
