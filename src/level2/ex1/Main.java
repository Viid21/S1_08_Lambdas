package level2.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Sara", "Al", "asa", "Andrea", "Carla", "Maria", "Patata");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .forEach(System.out::println);
    }
}
