package level2.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(11, 22, 21, 54, 35, 341, 200);
        System.out.println(returnIntegersWithLetters(ints));
    }

    public static String returnIntegersWithLetters(List<Integer> ints) {
        return ints.stream()
                .map(i -> ((i % 2 == 0) ? "e" + i : "o" + i))
                .collect(Collectors.joining(", "));
    }
}
