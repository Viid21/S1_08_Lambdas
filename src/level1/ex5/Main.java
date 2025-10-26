package level1.ex5;

import level1.ex5.interfaces.PiProvider;

public class Main{
    public static void main(String[] args) {
        PiProvider pi = () -> 3.1415;
        System.out.println(pi.getPiValue());
    }
}
