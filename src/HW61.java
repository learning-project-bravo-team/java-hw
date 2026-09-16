public class HW61 {

    public static void summ() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int summ = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                summ = summ + array[row][col];
            }
        }
        System.out.println(summ);
    }
}
