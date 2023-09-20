package Group;
import static Group.helper.*;
import static hW.helper.task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        task(1);
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для ввода

        System.out.print("Введите число: "); // Приглашение к вводу
        int number = scanner.nextInt(); // Считывание целого числа с клавиатуры

        System.out.println("Вы ввели число: " + number); // Вывод введенного числа
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else
            System.out.println("Число нечетное");

////        scanner.close(); // Закрытие Scanner после использования
//
        task(2);
        int summ = 0;
        int arraySize = 40; // Размер массива
        int[] randomArray = generateRandomArray(arraySize); // Создание и заполнение массива

        // Вывод элементов массива
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
            summ = summ + randomArray[i];
        }
        System.out.println();
        System.out.println("Сумма = " + summ);

//
        task(3);
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxi) {
                maxi = randomArray[i];
            }

        }
        System.out.println(maxi);

        task(4);
//
        Scanner scanner1 = new Scanner(System.in); // Создание объекта Scanner для ввода

        System.out.print("Введите строку: "); // Приглашение к вводу
        String inputString = scanner1.nextLine(); // Считывание строки с клавиатуры

        System.out.println("Вы ввели: " + inputString); // Вывод введенной строки

        if (isPalindrome(inputString)) {
            System.out.println("Строка   является палиндромом.");
        } else {
            System.out.println("Строка  не является палиндромом.");

        }
////        scanner1.close(); // Закрытие Scanner после использования

//
        task(5);
        int count = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < 0) {
                count++;
                System.out.println(randomArray[i]);
            }

        }
        System.out.println(count);
        task(6);
        Scanner scanner2 = new Scanner(System.in); // Создание объекта Scanner для ввода

        System.out.print("Введите число: "); // Приглашение к вводу
        number = scanner2.nextInt(); // Считывание целого числа с клавиатуры

        System.out.println("Вы ввели число: " + number);
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
        task(7);
        plainNumbers(37);

        task(8);
        bubleBig(randomArray);
        task(9);
        fib(3);

        task(10);
        int num1 = 0;
        int num2 = 0;
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {-100, -50, 30, 165, -168, -251, -287, -393, -404, -413};
        for (int i = 0; i < ar1.length; i++) {
            num1++;

        }
        for (int i = 0; i < ar2.length; i++) {
            num2++;

        }
        int[] combo = new int[num1 + num2];
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        // Merge and group the two arrays
        while (index1 < ar1.length && index2 < ar2.length) {
            combo[index++] = ar1[index1++];
            combo[index++] = ar2[index2++];
        }

        // If there are remaining elements in ar1, add them to combo
        while (index1 < ar1.length) {
            combo[index++] = ar1[index1++];
        }

        // If there are remaining elements in ar2, add them to combo
        while (index2 < ar2.length) {
            combo[index++] = ar2[index2++];
        }

        // Print the grouped array
        System.out.print("Grouped Array: ");
        for (int i = 0; i < combo.length; i++) {
            System.out.print(combo[i] + " ");
        }
        System.out.println();
        String aa = Arrays.toString(combo);
        System.out.println("Наш Array = " + Arrays.toString(combo));

        bubleSmall(combo);
        System.out.println(aa);

        countingSheep(5);
        System.out.println(countingSheep(5));
        task(11);


        /**
         * Replace
         */
        String inputString1 = "Ybrobrubr brabrrbrebr brtbrhbrebr brbbrebrsbrtbr brQbrAbr brebrvbrebrrbr";
        String outputString = inputString1.replaceAll("br", "");

        System.out.println(outputString);
    }



    public static String countingSheep(int num) {
        String result = ""; // Создаем пустую строку для записи результата
        int i = 0; // Создаем счетчик i и инициализируем его значением 0

        // Начинаем цикл, который будет выполняться, пока i меньше чем значение num
        while (i < num) {
            // Внутри цикла, мы будем добавлять к строке result мурмур о количестве овец,
            // где (i+1) представляет номер овцы (мы добавляем 1, так как индексы начинаются с 0)
            // и затем " sheep..." - это фраза, которую мы добавляем
            result += (i + 1) + " sheep...";

            i++; // Увеличиваем счетчик i на 1 для перехода к следующей овце
        }

        return result; // Возвращаем строку result, содержащую мурмур о количестве овец


    }
}
