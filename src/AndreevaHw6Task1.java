void main() {

    /*
    Задача №1
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести сумму элементов массива.
    */

    int[][] array1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {-1, -2, -3, -4},
            {-5, -6}
    };

    int sum = 0;

    for (int i = 0; i < array1.length; i = i + 1) {
        for (int j = 0; j < array1[i].length; j = j + 1) {
            sum = sum + array1[i][j];
        }
    }

    IO.println(sum);


    /*
    Задача №2
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести максимальное значение массива.
    */

    int[][] array2 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {-1, -2, -3, -4},
            {-5, -6}
    };

    int max = array2[0][0];

    for (int i = 0; i < array2.length; i = i + 1) {
        for (int j = 0; j < array2[i].length; j = j + 1) {
            if (array2[i][j] > max) {
                max = array2[i][j];
            }
        }
    }

    IO.println(max);


    /*
    Задача №3
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести количество элементов в массиве.
    */

    int[][] array3 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {-1, -2, -3, -4},
            {-5, -6}
    };

    int count = 0;

    for (int i = 0; i < array3.length; i = i + 1) {
        for (int j = 0; j < array3[i].length; j = j + 1) {
            count = count + 1;
        }
    }

    IO.println(count);
}