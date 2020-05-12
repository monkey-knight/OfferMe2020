package FrequentlyUsedClasses;

import java.lang.*;

public class TestEnum {
    public enum Color {
        red, green, blue
    }

    public static void main(String[] args) {
        Color str = Color.blue;
        switch (str){
            case red:
                System.out.println("red");
                break;
            case green:
                System.out.println("green");
                break;
            case blue:
                System.out.println("blue");
            default:
                System.out.println("default");
        }
    }
}
