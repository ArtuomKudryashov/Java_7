package Group;

import java.util.Arrays;
import java.util.Random;

public class helper {
    public static void task(int a) {
        String t = "<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = "Task #";
        String b = ">>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(t + task + a + b);

    }

    public static int[] generateRandomArray(int size) {

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(2000) - 500; // Генерация случайного числа от 0 до 99
        }

        return array;
    }

    public static boolean isPalindrome(String str) {
        String line = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                System.out.println("СТРОКА - не палиндром!");

                return false; // Возвращаем false при несовпадении символов
            }
        }
        return true; // Возвращаем true, если все символы совпали
    }

    public static void plainNumbers(int n) {
        boolean isComposite = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isComposite = true;
                break; // Выход из цикла, как только найден делитель
            }
        }

        if (isComposite) {
            System.out.println("Число составное");
        } else {
            System.out.println("Число простое");
        }


    }

    public static void bubleBig(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            for (int j = 0; j < n.length - i; j++) {
                if (n[j] < n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(n));
    }

    public static void fib(int n) {
        int[] array9 = new int[n];

        for (int i = 0; i < array9.length; i++) {
            if (i == 0 || i == 1) {
                array9[i] = 1;
            } else {
                array9[i] = array9[i - 1] + array9[i - 2];
            }


        }
        System.out.print(array9[array9.length - 1]);


    }

    public static void bubleSmall(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            for (int j = 0; j < n.length - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(n));
    }

    /**
     * Метод  к  10
     */
    public static void twoArrays(int[] n, int[] v) {
        // Создаем генератор случайных чисел
        Random random = new Random();
        // Генерируем случайный размер массива от 1 до 10
        int arraySize = random.nextInt(20) + 1;
        // Создаем массив с сгенерированным случайным размером
        int[] randomArray = new int[arraySize];
        System.out.println("Random array size: " + arraySize);
        System.out.println("Random array elements:");


    }
}
