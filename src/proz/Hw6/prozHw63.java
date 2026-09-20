static void main() {
//    Вывести следующие строки с соответствующим форматированием (как пирамиды):
//    Задача №1
//
//    0  1  2  3  4  5  6  7  8  9
//    0  1  2  3  4  5  6  7  8
//    0  1  2  3  4  5  6  7
//    0  1  2  3  4  5  6
//    0  1  2  3  4  5
//    0  1  2  3  4
//    0  1  2  3
//    0  1  2
//    0  1
//    0
    for (int i = 9; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();
    }

//0  1  2  3  4  5  6  7  8  9
//   0  1  2  3  4  5  6  7  8
//      0  1  2  3  4  5  6  7
//         0  1  2  3  4  5  6
//            0  1  2  3  4  5
//               0  1  2  3  4
//                  0  1  2  3
//                     0  1  2
//                        0  1
//                           0

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("   ");
        }
        for (int k = 0; k < (10 - i); k++) {
            System.out.print(k + "  ");
        }
        System.out.println();
    }

//Задача №3
//
//9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//      6 5 4 3 2 1 0 1 2 3 4 5 6
//        5 4 3 2 1 0 1 2 3 4 5
//          4 3 2 1 0 1 2 3 4
//            3 2 1 0 1 2 3
//              2 1 0 1 2
//                1 0 1
//                  0


    for (int i = 0; i <= 9; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        for (int j = (9 - i); j >= 0; j--) {
            System.out.print(j + " ");
        }
        for (int j = 1; j <= (9 - i); j++) {
            System.out.print(j + " ");
        }

        System.out.println();
    }


}






