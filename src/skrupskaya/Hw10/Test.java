package skrupskaya.Hw10;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static String abbrevName(String name) {
        List<String> names = List.of(name.split(" "));
        return String.format("%s.%s", names.getFirst().toUpperCase().charAt(0), names.getLast().toUpperCase().charAt(0));// works on 21 and hire
    }
    public static boolean feast(String beast, String dish) {
        List<String> beasts = List.of(beast.split(" "));
        char a = beasts.getFirst().toLowerCase().charAt(0);
        int n = beasts.getLast().length();
        char b = beasts.getLast().toLowerCase().charAt(n-1);

        List<String> dishes = List.of(dish.split(" "));
        char c = dishes.getFirst().toLowerCase().charAt(0);
        int n2 = dishes.getLast().length();
        char d = dishes.getLast().toLowerCase().charAt(n2-1);

        if (a == c && b == d) {
            return true;
        }
        return false;
    }
    public static String tripleTrouble(String one, String two, String three) {
        String str = "";
        for (int i = 0; i < one.length(); i++) {
            str = str + one.charAt(i) + two.charAt(i) + three.charAt(i);
            }
        return str;
    }
    public static String position(char alphabet) {
        List<Character> characters = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            characters.add(c);
        }
        for (char a : characters) {
            if (a == alphabet) {
                int n = characters.indexOf(alphabet) + 1;
                return "Position of alphabet: " + n;
            }
        }
        return null;
    }
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int summ = 0;
        for (int i : arr1) {
            summ = summ + i;
        }
        for (int j : arr2) {
            summ = summ + j;
        }
        return summ;
    }
}
