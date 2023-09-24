package hW;

import org.apache.commons.lang3.StringUtils;

public class HW_13 {
    public static void main(String[] args) {
        String st = "Привет всем кто живет на луне!";

        int maxLength = 10; // Максимальная длина строки

        // Используем Apache Commons Lang для сокращения строки
        String abbreviatedString = StringUtils.abbreviate(st, maxLength);

        System.out.println(abbreviatedString);



    }

}
