package hW;
import static hW.helper.task;

public class HW_5 {
    public static void main(String[] args) {
        task(1);
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));


            }
        }
        task(2);
        int n = 0;
        String s2 = "Перевыборы выбранного президента";
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                n++;
//
            }


        }
        System.out.println(n);

        task(3);
        String ss = "Посмотрите как Рите нравится ритм";
        String substring = "рит";

        ss = ss.toLowerCase(); // Приводим строку к нижнему регистру для регистронезависимого поиска
        substring = substring.toLowerCase(); // Приводим подстроку к нижнему регистру

        int index = ss.indexOf(substring); // Ищем первое вхождение
        System.out.println(index);

        while (index != -1) {
            System.out.println("Индекс начала подстроки: " + index);
            index = ss.indexOf(substring, index + 1); // Продолжаем поиск, начиная с следующего символа
        }
        String s4 = "Посмотрите как Рите нравится ритм";
         substring = "ё";
         index =s4.indexOf(substring);
        System.out.println(index);

        task(3333);
        String sss = "Посмотрите как Рите нравится ритм ";
        sss = sss.toLowerCase();
        String sub = "рит";
        for (int i = 0; i < sss.length() - sub.length(); i++) {
            if (sss.substring(i, i + sub.length()).equals(sub)) {
                System.out.println(i);
                System.out.println();
            }
        }


        /** Экстра задача

         Дан массив:
         String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
         необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/

        task(4);
        String[][] array10 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count = 0;

        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                if (!array10[i][j].contains("е")) {
                    count++;

                }

            }
        }
        System.out.println(count);
    }
}









