public class SKrupHW62 {
    public static void displayAllO() {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(" each 'о' is printed");
    }

    public static void countE() {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count = count + 1;
            }
        }
        System.out.println(count + " is the count of 'e' in the given sentence");
    }

    public static void subStrIndex() {
        String s = "Посмотрите как Рите нравится ритм";
        String sToLowerCase = s.toLowerCase();//to have full string with characters to lower case
        String rit = "рит";

        int i = sToLowerCase.indexOf(rit);
        System.out.print("string rit starts from the indexes: ");

        while (i != -1) {
            System.out.print(i);
            System.out.print(" ");
            i = sToLowerCase.indexOf(rit, i + 1);
        }
    }
    public static void countStringsWithotE() {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}
        };

        int counter = 0;
        for (String[] row : array) {
            for (String cell : row) {
                int i = cell.indexOf('е');
                if (i != -1) {
                    continue;
                }
                counter++;
            }
        }
        System.out.println(counter + " Strings with no 'е'");
    }
}
