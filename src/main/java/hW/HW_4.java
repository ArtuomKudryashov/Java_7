package hW;

import java.util.Arrays;

public class HW_4 {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<Task#1>>>>>>>>>>>");
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);

        }
        System.out.println("<<<<<<<<<<Task#2>>>>>>>>>>>");

        for (int i = 1; i < 10000; i=i*5) {
            System.out.println(i);



        }
        int stepen5 = 0;

        for (int i = 0; stepen5 < 10000; i++) {
            stepen5 = (int) Math.pow(5, i);
            if (stepen5 < 10000) {
                System.out.print("Число 5 возводится в степень " + i + ".");
                System.out.println(" Результат возведения в степень = " + stepen5);
            }
        }
        System.out.println("<<<<<<<<<<Task#3>>>>>>>>>>>");
        for (int i = 40; i <=60 ; i++) {
            if (i%4==0){
                System.out.println(i);
            }

        }
        System.out.println("<<<<<<<<<<Task#3.a>>>>>>>>>>>");

        for (int i = 40; i <=60 ; i=i+4) {
            System.out.println(i);

        }
        System.out.println("<<<<<<<<<<Task#4>>>>>>>>>>>");

        int sum =0;

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
            System.out.println(sum);
        }
        System.out.println("Итоговая сумма");
        System.out.println(sum);


        System.out.println("<<<<<<<<<<Task#5>>>>>>>>>>>");
        int[] array5 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int max =  Integer.MIN_VALUE;
//        for (int i = 0; i < array5.length ; i++) {
//            if (max<array5[i]){
//                max= array5[i];
//            }
//
//        }
//        System.out.println(max);
//        System.out.println("<<<<<<<<<<Task#6>>>>>>>>>>>");
//        int[] array6 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int min =  Integer.MAX_VALUE;
//        for (int i = 0; i < array5.length ; i++) {
//            if (min>array5[i]){
//                min= array5[i];
//            }
//
//        }
//        System.out.println(min);
//        System.out.println("<<<<<<<<<<Task#7>>>>>>>>>>>");
//        int summ=0;
//
//
//        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < array7.length ; i++) {
//            summ=summ+array7[i];
//
//        }
//        System.out.println(summ*1.0/array7.length);
//
//        System.out.println("<<<<<<<<<<Task#8>>>>>>>>>>>");
//        int positive =0;
//        int negative = 0;
//
//
//
//        int[] array8={-3, 8, -15, 20, -7, 12, 0, -6, 18, -9, 4, -11, 6, -2, 14, -1, 10, -5, 16, -13};
//        for (int i = 0; i < array8.length; i++) {
//            if (array8[i]>=0) {
//                positive = positive + 1;
//
//            } else {
//                negative = negative + 1;
//            }
//
//        }
//        System.out.println("Count of positive  number= "+positive +'\n'+ "Count  of negative number = "+negative);
//
        System.out.println("<<<<<<<<<<Task#9>>>>>>>>>>>");
        int[] array9 = {7, -4, 11, -9};
        boolean isSorted = true;

        for (int i = 1; i < array9.length; i++) {
            if (array9[i] < array9[i - 1]) {
                isSorted = false;
                break; // Массив уже не отсортирован, можно прекращать проверку
            }
        }

        if (isSorted) {
            System.out.println("Да, массив отсортирован");
        } else {
            System.out.println("Надо сортировать массив");
        }
        int[] array9a = {7, -4, 11, -9};
        for (int i = 1; i <array9a.length ; i++) {
            for (int j = 0; j < array9a.length - i; j++) {
                if (array9a[j] > array9a[j + 1]) {
                    int temp = array9[j];
                    array9a[j] = array9a[j + 1];
                    array9a[j + 1] = temp;
                }
            }
        }
        /**
         Итерация 1 (i = 1):

         Сравниваются элементы 7 и -4. Так как 7 больше чем -4, выполняется обмен.
         Массив становится: {-4, 7, 11, -9}

         Итерация 2 (i = 2):
         Сравниваются элементы -4 и 7. Так как -4 меньше чем 7, обмен не выполняется.
         Сравниваются элементы 7 и 11. Так как 7 меньше чем 11, обмен не выполняется.
         Сравниваются элементы 11 и -9. Так как 11 больше чем -9, выполняется обмен.
         Массив становится: {-4, 7, -9, 11}

         Итерация 3 (i = 3):
         Сравниваются элементы -4 и 7. Так как -4 меньше чем 7, обмен не выполняется.
         Сравниваются элементы 7 и -9. Так как 7 больше чем -9, выполняется обмен.
         Сравниваются элементы -9 и 11. Так как -9 меньше чем 11, обмен не выполняется.??????
         Массив остается неизменным: {-4, -9, 7, 11}
         После трех итераций внешнего цикла сортировки пузырьком, массив становится отсортированным: {-4, -9, 7, 11}.
         */
        System.out.println(Arrays.toString(array9));
        System.out.println("<<<<<<<<<<Task#10>>>>>>>>>>>");

        int n = 15;
        int[] arr10 = new int[n];
        arr10[0] = 1;
        arr10[1] = 1;

        for (int i = 2; i < n; i++) {
            arr10[i] = arr10[i - 1] + arr10[i - 2];
        }

        System.out.print("Сгенерированный ряд чисел: ");
        for (int num : arr10) {
            System.out.print(num + " ");
        }
        System.out.println();

        int k = 10;

        int[] array11= new int[k];

        for (int i = 0; i < array11.length; i++) {
            if (i == 0 || i == 1) {
                array11[i] = 1;
            } else {
                array11[i] = array11[i-1] + array11[i-2];
            }
        }

        for (int i = 0; i < array11.length; i++) {
            System.out.print(array11[i]);
            System.out.print(" ");
        }
        Integer c =12;
        double m = 12.0;
        System.out.println(c==m);










//        }





    }
}
