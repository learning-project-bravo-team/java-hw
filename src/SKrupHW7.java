public class SKrupHW7 {

    public static int summ(int a, int b) {
        int result = a + b;
        return result;
    }
    public static int substract(int a, int b) {
        return (a - b);
    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    public static double divide(int a, int b) {
        double result = a * 1.0 / b;
        return result;
    }
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return 2 * i;
    }
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static String numberToString(int num) {
        String str = "" + num;
        return str; // Return a string of the number here!
    }
    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE;
        for (int i : args) {
           if (i < smallest) {
               smallest = i;
           }
        }
        return smallest;
    }
    public static String countingSheep(int num) {
        //Add your code here
        String str = "";
        for (int i = 1; i <= num; i++) {
            str = str + i + " sheep...";
        }
        return str;
    }
}
