public class SKrupHW63 {

    public static void leftPyramid() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void rightPyramid() {
        for (int i = 0; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                    System.out.print("  ");
            }
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void fullPyramid() {
        for (int i = 0; i <= 9; i++) {
            for (int a = 1 ; a <= i; a++) {
                System.out.print("  ");
            }
            for (int j = 9 - i; j >= 0; j-- ) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= 9 - i; k++ ) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
