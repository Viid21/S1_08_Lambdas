package level2.ex3;

import level2.ex3.interfaces.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator add =(a, b) -> a + b;
        Calculator remove = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;
    }
}
