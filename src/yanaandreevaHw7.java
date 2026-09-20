// Сложение двух чисел
static int add(int a, int b) {
    return a + b;
}

// Вычитание двух чисел
static int subtract(int a, int b) {
    return a - b;
}

// Умножение двух чисел
static int multiply(int a, int b) {
    return a * b;
}

// Деление двух чисел
static int divide(int a, int b) {
    return a / b;
}

void main(String[] args) {

    System.out.println(add(10, 5));
    System.out.println(subtract(10, 5));
    System.out.println(multiply(10, 5));
    System.out.println(divide(10, 5));
}