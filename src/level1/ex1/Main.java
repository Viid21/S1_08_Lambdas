package level1.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Olivia");
        names.add("Paco");
        names.add("Sílvia");
        names.add("Carmen");
        names.add("Esteban");
        names.add("Monica");

        names.stream()
                .filter(name -> name.contains("o"))
                .forEach(System.out::println);

    }
}
