package ilya.ilya.HW6;

public class IlyaHW63 {

    public static void main(String[] args) {
        //Задача №6.3.1
        /**Вывести следующие строки с соответствующим форматированием (как пирамиды):
         0  1  2  3  4  5  6  7  8  9
         0  1  2  3  4  5  6  7  8
         0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
         0  1  2  3  4  5
         0  1  2  3  4
         0  1  2  3
         0  1  2
         0  1
         0
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Задача №6.3 .2
        /**
         * Обратный треугольник
         */
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Задача №6.3.3
        /**Сосулька.
         * */

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
