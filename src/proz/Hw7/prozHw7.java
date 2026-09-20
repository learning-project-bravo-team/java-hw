
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

public static int sum(int a, int b) {
    return a + b;
}

public static int sub(int a, int b) {
    return a - b;
}

public static int mult(int a, int b) {
    return a * b;
}

public static double division(int a, int b) {
    return (double) a / b;
}

static void main() {

    int x = 7;
    int y = 5;
    IO.println("Сумма: " + sum(x, y));
    IO.println("Вычитание: " + sub(x, y));
    IO.println("Умножение: " + mult(x, y));
    IO.println("Деление: " + division(x, y));


}