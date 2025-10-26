package level1.ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Roberto", "Carolina", "Olivia", "Paco", "Sílvia", "Carmen", "Esteban", "Monica");
        List<String> filteredNames = names.stream()
                .filter(name -> name.contains("o"))
                .filter(name -> name.length()>5)
                .toList();
        filteredNames.forEach(System.out::println);
    }
}
