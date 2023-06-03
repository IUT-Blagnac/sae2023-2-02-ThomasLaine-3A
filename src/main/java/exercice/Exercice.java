package exercice;

import java.util.List;
import java.util.ArrayList;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        String[] mots = str.split(" ");
        List<String> result = new ArrayList<>();

        for (Character lettre : ordre) {
            for (String mot : mots) {
                if (mot.startsWith(lettre.toString())) {
                    result.add(mot);
                }
            }
        }

        return result;
    }
}


