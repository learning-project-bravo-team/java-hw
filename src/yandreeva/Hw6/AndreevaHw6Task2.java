void main() {

    /*
    Задача №1
    Дана строка:
    String s = "Перестановочный алгоритм быстрого действия";
    Необходимо вывести все буквы "о" из этой строки.
    Ответ: ооооо
    */

    String s1 = "Перестановочный алгоритм быстрого действия";

    for (int i = 0; i < s1.length(); i = i + 1) {
        if (s1.charAt(i) == 'о') {
            IO.print("о");
        }
    }

    IO.println();

    /*
    Задача №2
    Дана строка:
    String s = "Перевыборы выбранного президента";
    Необходимо подсчитать количество букв "е".
    Ответ: 4
    */

    String s2 = "Перевыборы выбранного президента";

    int count = 0;

    for (int i = 0; i < s2.length(); i = i + 1) {
        if (s2.charAt(i) == 'е') {
            count = count + 1;
        }
    }

    IO.println(count);


    /*
    Задача №3
    Дана строка:
    String s = "Посмотрите как Рите нравится ритм";
    Необходимо вывести индексы начала всех подстрок "рит",
    независимо от регистра.
    Ответ: 6, 15, 29
    */

    String s3 = "Посмотрите как Рите нравится ритм";

    for (int i = 0; i < s3.length() - 2; i = i + 1) {

        String part = s3.substring(i, i + 3);

        if (part.equalsIgnoreCase("рит")) {
            IO.println(i);
        }
    }


    /*
    Экстра задача
    Дан массив:
    String[][] array = {
        {"Привет", "всем", "кто"},
        {"изучает", "язык", "программирования"},
        {"java"}
    };
    Необходимо подсчитать количество строк в массиве,
    которые не содержат буквы "е".
    */

    String[][] array = {
            {"Привет", "всем", "кто"},
            {"изучает", "язык", "программирования"},
            {"java"}
    };

    int rowsCount = 0;

    for (int i = 0; i < array.length; i = i + 1) {

        boolean containsE = false;

        for (int j = 0; j < array[i].length; j = j + 1) {

            if (array[i][j].toLowerCase().contains("е")) {
                containsE = true;
            }
        }

        if (containsE == false) {
            rowsCount = rowsCount + 1;
        }
    }

    IO.println(rowsCount);
}