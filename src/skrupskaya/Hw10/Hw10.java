package skrupskaya.Hw10;

import java.util.Arrays;
import java.util.List;

public class Hw10 {
    public static String boolToWord(boolean b) {
        if (b) {
            return  "Yes";
        } else {
            return  "No";
        }
    }
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> null;
        };
    }
    public static int[] reverse(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length && n > 0; i++, n--) {
            array[i] = n;
        }
        return array;
    }
    public static String[] stringToArray(String s) {
        String[] array = s.split(" ");
        return array;
    }
    public static String correct(String string) {
        string = string.replace("5", "S");
        string = string.replace("1", "I");
        string = string.replace("0", "O");
        return string;
    }
}
