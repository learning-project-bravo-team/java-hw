package ilya.ilya.HW7;

public class IlyaHW7 {

    public static void main(String[] args) {
    }

    // Homework #7
     /**Задача №7.1
     Необходимо написать 4 метода:
     сложение 2х чисел
     вычитание 2х чисел
     умножение 2х чисел
     деление 2х чисел
     */

     public static int sum(int a, int b) {
     return a + b;
     }

     public static int subtr(int a, int b) {
     return a - b;
     }

     public static int multipl(int a, int b) {
     return a * b;
     }

     public static int div (int a, int b) {
     return a / b;
     }



    /**
     * Задача №7.2
     * Code as fast as you can! You need to double the integer and return it.
     */
    public static int doubleInteger(int i) {
        return i * 2;
    }

    /**
     * Задача №7.2
     * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
     */
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }

    /**
     * Задача №7.3
     * We need a function that can transform a number (integer) into a string.
     */
    public static String numberToString(int num) {
        Integer num1 = num;
        return num1.toString();
    }

    /**
     * Задача №7.4
     * Given an array of integers your solution should find the smallest integer.
     */
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    /**
     * Задача №7.5
     * If you can't sleep, just count sheeps!!
     */
    public static String countingSheep(int num) {
        String murmur = new String();
        for (int i = 1; i <= num; i++) {
            murmur += i + " sheep...";
        }
        return murmur;
    }
}
