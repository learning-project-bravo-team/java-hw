static void main() {
//    Задача №1
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести сумму элементов массива.

    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            sum += array[i][j];
        }
    }
    System.out.println("Sum: " + sum);

//    Задача №2
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести максимальное значение массива.
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] > max) {
                max = array[i][j];
            }
        }
    }
    System.out.println("Max value: " + max);

//    Задача №3
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести количество элементов в массиве.
    int count = 0;
    for (int[] row : array) {
        for (int value : row) {
            count++;
        }
    }
    System.out.println("Count: " + count);


}
