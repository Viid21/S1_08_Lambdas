package level1.ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(23433, "Germany", 9, "Bus Station", "Potato", 352821635, "Lasagna", 142725,
                21, "Carlos");
        List<String> stringsList = list.stream()
                .map(Object::toString)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        stringsList.forEach(System.out::println);
    }
}
