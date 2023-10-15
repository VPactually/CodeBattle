import java.util.*;
import java.util.stream.*;

public class Main {
    public static boolean isMany(String text) {
        char a = text.charAt(text.length() - 1);
        return a == 's';
    }

    public static String mood(String mood) {
        if (mood.isEmpty())
            return "Today, I am feeling neutral.";
        else
            return "Today, I am feeling " + mood + '.';
    }

    public static String figures(int sides) {
        return switch (sides) {
            case 1 -> "circle";
            case 2 -> "semi-circle";
            case 3 -> "triangle";
            case 4 -> "square";
            case 5 -> "pentagon";
            case 6 -> "hexagon";
            case 7 -> "heptagon";
            case 8 -> "octagon";
            case 9 -> "nonagon";
            case 10 -> "decagon";
            default -> "Not a figure";
        };
    }

    public static void main(String[] args) {
        System.out.println(figures(8));
    }
}
