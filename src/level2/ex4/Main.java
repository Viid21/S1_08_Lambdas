package level2.ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("Hola", 123, "Peres", "Casa", 45, "Barcelona", "Carles", 9);

        list.stream()
                .map(Object::toString) // tot a String
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .sorted((s1, s2) -> {
                    boolean cont1 = s1.contains("e");
                    boolean cont2 = s2.contains("e");
                    if (cont1 && !cont2) return -1;
                    if (!cont1 && cont2) return 1;
                    return 0;
                })
                .map(s -> s.replace("a", "4").replace("A", "4"))
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }
}
