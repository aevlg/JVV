package Lesson4;
import java.util.*;

public class Lesson4 {


    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "нравственный",
                "существо",
                "местный",
                "крикнуть",
                "лошадь",
                "религиозный",
                "оборонный",
                "утро",
                "оборонный",
                "существо"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("ПЕРВОНАЧАЛЬНЫЙ СПИСОК: ");
        System.out.println(words.toString());
        System.out.println("--------------------------------");
        System.out.println("УНИКАЛЬНЫЕ СЛОВА");
        System.out.println(unique.toString());
        System.out.println("--------------------------------");
        System.out.println("СЛОВО В СПИСКЕ ПОВТОРЯЛОСЬ >  ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}

