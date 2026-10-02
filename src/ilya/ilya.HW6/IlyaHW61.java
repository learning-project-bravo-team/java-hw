package ilya.ilya.HW6;

public class IlyaHW61 {
    public static void main(String[] args) {

    // Homework #6
    // Задача №6.1.1
        /**
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести сумму элементов массива.
         */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ = summ + array[i][j];
            }
        }
        System.out.println("Сумма: " + summ);

    // Задача №6.1.2
        /**
         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести максимальное значение массива.
         */
        int[][] arrayTwo = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = arrayTwo[0][0];
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                if (arrayTwo[i][j] > max) {
                    max = arrayTwo[i][j];
                }
            }
        }
        System.out.println("Max: " + max);

    // Задача №6.1.3
        /**
         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести количество элементов в массиве.
         */
        int[][] arrayThree = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < arrayThree.length; i++) {
            count += arrayThree[i].length;
        }
        System.out.println("Количество элементов в массиве: " + count);
    }
}
