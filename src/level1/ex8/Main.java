package level1.ex8;

import level1.ex8.interfaces.ReverseStringProvider;

public class Main {
    public static void main(String[] args) {
        ReverseStringProvider reverser = stringBuilder -> new StringBuilder(stringBuilder).reverse()
                .toString();
        String reversedString = "David";

        System.out.println(reverser.reverse(reversedString));
    }
}
